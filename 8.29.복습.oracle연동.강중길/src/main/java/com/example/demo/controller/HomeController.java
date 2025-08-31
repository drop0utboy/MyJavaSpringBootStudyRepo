package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	
//	@GetMapping("/")
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String Home(HttpSession session) {
		return "home";
	}
}
