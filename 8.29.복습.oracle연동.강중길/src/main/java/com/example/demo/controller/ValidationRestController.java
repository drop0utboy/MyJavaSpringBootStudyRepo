package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Member;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/validation-rest")
public class ValidationRestController {
	@PostMapping("/request-parameter")
	public String requestParameter(@Valid Member member) {
		
		//강제로 에러 발생 시키기
		String data = null;
		data.length();
		return "{\"validation\":\"success\"}";
	}
	
	@RequestMapping("/json")
	public String json(@RequestBody @Valid Member member) {
		
		//강제로 에러 발생 시키기
		String data = null;
		data.length();
		return "{\"validation\":\"success\"}";
	}
}
