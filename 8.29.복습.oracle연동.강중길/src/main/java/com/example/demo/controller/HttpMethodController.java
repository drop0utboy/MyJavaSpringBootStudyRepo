package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Board;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping("/http")
public class HttpMethodController {
	@GetMapping("/getmethod") // /getmethod는 http://localhost:8080/http 이게 생략된 것이다
	public String getMethod() {
		log.error("getMethod() 실행");
		log.warn("getMethod() 실행");
		log.info("getMethod() 실행");
		log.debug("getMethod() 실행");
		return "http/getmethod";
	}
	
	@GetMapping("/postmethod")
	public String postMethod() {
		return "http/postmethod";
	}
	
	@GetMapping("/putmethod")
	public String putMethod() {
		return "http/putmethod";
	}
	
	@GetMapping("/deletemethod")
	public String deleteMethod() {
		return "http/deletemethod";
	}
	
	@GetMapping("/contentnego")
	public String contentNego() {
		return "http/contentnego";
	}
	

}
