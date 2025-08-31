package com.example.demo.controller;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.Member;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("receive-data-rest")
public class ReceiveDataRestController {
	@GetMapping("/path-variable1/{bno}")
	public Map<String, Integer> pathVariable1(@PathVariable("bno") int bno) {
		Map<String, Integer> map = new HashMap<>();
		map.put("bno", bno);
		return map;
	}

	@GetMapping("/path-variable2/{kind}/{bno}")
	public Map<String, Object> pathVariable2(@PathVariable("kind") String kind, @PathVariable("bno") int bno) {
		Map<String, Object> map = new HashMap<>();
		map.put("kind", kind);
		map.put("bno", bno);
		return map;
	}

	// mid=xxx&mname=xxx&mpassword=xxx
	@RequestMapping("/request-parameter")
	public Map<String, String> postMethodName(@RequestParam("mid") String mid, @RequestParam("mname") String mname,
			@RequestParam("mpassword") String mpassword) {
		log.info("mid: " + mid);
		log.info("mname: " + mname);
		log.info("mpassword: " + mpassword);

		Map<String, String> map = new HashMap<>();
		map.put("mid", mid);
		map.put("mname", mname);
		map.put("mpassword", mpassword);
		System.out.println("mname:" + mname);

		return map;
	}

	//{"mid"=xxx 이런식
	// <member><mid>>mid
	@RequestMapping("/json")
	public Map<String, String> json(@RequestBody Member member) {
		log.info("mid: " + member.getMid());
		log.info("mname: " + member.getMname());
		log.info("mpassword: " + member.getMpassword());

		Map<String, String> map = new HashMap<>();
		map.put("mid", member.getMid());
		map.put("mname", member.getMname());
		map.put("mpassword", member.getMpassword());

		return map;
	}
	
	@PostMapping("/multipart")
	  public Map<String, Object> multipart(
	    @RequestPart("title") String title, 
	    @RequestPart("attach") MultipartFile attach) throws Exception {     log.info("title: {}", title); 
	    log.info("original-filename: {}", attach.getOriginalFilename());
	    log.info("content-type: {}", attach.getContentType());

	    // 지금 현재 시간의 long 값 리턴 + 
	    // 0 : 1970.1.1 시작으로 1ms 단위로 지금까지 ? : 2025.8.23. ?값이 얻어진다. 중복 제거
	    String saveFilename = new Date().getTime() + "-" + attach.getOriginalFilename();
	    log.info("saved-filename: {}", saveFilename);

	    // 방법1
	    /*OutputStream os = new FileOutputStream("C:/Temp/" + saveFilename);
	    InputStream is = attach.getInputStream(); // 여기서 읽고 위에 붙이기

	    BufferedOutputStream bos = new BufferedOutputStream(os);
	    BufferedInputStream bis = new BufferedInputStream(is);

	    byte[] arr = new byte[1025];
	    while(true) {
	      int readNum = bis.read(arr); // throws
	      if(readNum == -1) break;
	      bos.write(arr, 0, readNum);
	    }
	    bos.flush();
	    bos.close();
	    bis.close();*/

	    
	    // 방법2 파일 사이즈가 작을 경우
	    attach.transferTo(new File("C:/Temp/" + saveFilename)); // 파일 객체 생성

	    //응답 생성
	    Map<String, Object> map = new HashMap<>();
	    map.put("title", title);
	    map.put("originalFilename", attach.getOriginalFilename());
	    map.put("saveFilename", saveFilename);
	    return map;
	  }
	
	
	@GetMapping("/get-header")
	public String getHeader(@RequestHeader("User-Agent") String userAgent) { // userAgent라는 String변수에 유저에이전트 헤더 정보를 가져옴
		log.info("User-Agent: {}", userAgent);
		String browserKind = null;
		
		if(userAgent.contains("Chrome")) {
			if(userAgent.contains("Edg")) {
				browserKind = "엣지 브라우저";
				
			} else {
				browserKind = "크롬 브라우저";
			}
		}
		
		return "" + browserKind;
	}
	
	@GetMapping("/set-cookie")
	public String getCookie(HttpServletResponse response) {
		Cookie cookie1 = new Cookie("userName", "hong");  //F3으로 정보 찾아보기!
		Cookie cookie2 = new Cookie("userEmail", "hong@mycompany.com");
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		return "";
	}
	
	@GetMapping("/get-cookie")
	public String setCookie(@CookieValue("userName") String userName,
			@CookieValue("userEmail") String userEmail
			) {
		
		return "value :" + userName + "\n" + userEmail;
	}

}
