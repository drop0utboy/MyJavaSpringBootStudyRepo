package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Board;
import com.example.demo.dto.Member;
import com.example.demo.dto.Pager;
import com.example.demo.service.BoardService;
import com.example.demo.service.MemberService;
import com.example.demo.service.MemberService.RemoveResult;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/db")
public class DBController {
	@Autowired
	private MemberService memberService; // 마이바티스가 구현한걸 주입해준다
	@Autowired
	private BoardService boardService;
	
	@PostMapping("/member-create")
	public String memberCreate(@RequestBody Member member) {
		log.info(member.toString());
		memberService.join(member);
		
		return "회원 등록 성공";
	}
	
	@GetMapping("/member-info")
	public Member memberInfo(@RequestParam("mid") String mid) {
		Member member = memberService.getMember(mid); 
				return member;
	}
	
	
	@PutMapping("/member-modify")
	public Map<String, Object> memberModify(@RequestBody Member member) {
		Member dbMember = memberService.modify(member);
		
		Map<String, Object> map = new HashMap<>();
		
		if(dbMember == null) {
			map.put("result", "fail");
		} else {
			map.put("result", "success");
			map.put("member", dbMember);
			
		}
		
		return map;
	}
	
	@DeleteMapping("/member-remove/{mid}")
	public String memberRemove(@PathVariable("mid") String mid) {
		RemoveResult removeResult = memberService.remove(mid);
		
		JSONObject jsonObject = new JSONObject();
		
		
		if (removeResult == RemoveResult.SUCCESS) {
			jsonObject.put("result", "success");
		} else {
			jsonObject.put("result", "fail");
		}
		return jsonObject.toString();
	}
	
	@GetMapping("/temp")
	public String temp() {
		for(int i=0; i<10000; i++) {
			Board board = new Board();
			board.setBtitle("제목" + i);
			board.setBcontent("내용" + i);
			board.setBwriter("user02");
			
			
			boardService.create(board);
		}
		return "1만개 데이터 생성됨";
	}
	
	@GetMapping("/board-list")
	public List<Board> boardList(@RequestParam(value="PageNo", defaultValue="1") int pageNo) {
		
		log.info("pageNo: " + pageNo);
		Pager pager = new Pager(10, 10, 10000, pageNo);
		
		List<Board> list = boardService.getListByPage(pager);
		
		
		return list;
	}
}
