package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/servlet-api")
@Slf4j
public class ServletApiController {
	@GetMapping("/request-response")
	public String requestResponse() {
		return "servlet-api/request-response";
	}
	
	@GetMapping("/session")
	public String session() {
		return "servlet-api/session";
	}
	
	@GetMapping("/redirectgci")
	public String getMethodName() {
		return "redirect:/servlet-api-rest/get-client-ip";
		
		
	}

	@GetMapping("/redirect1")
	public String redirect1() {
		return "redirect:/servlet-api-rest/request-response";
	}
	
	@GetMapping("/redirect2")
	public String redirect2(HttpServletResponse response) throws Exception {
		if (true) {
			response.sendRedirect("/servlet-api-rest/request-response");
		}
		return "";
	}
}
