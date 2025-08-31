package com.example.demo.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.example.demo.dto.Board;


@RestController
@RequestMapping("/http-rest")
public class HttpMethodRestController {
	@GetMapping("/getmethod")
	public String getMethod() {
		return "응답 내용";
	}

	@GetMapping(value = "/getmethod2", produces = {"application/json", "application/xml"})
	public List<String> GetMethod2() {
		List<String> list = new ArrayList<>();
		list.add("안녕하세요");
		list.add("a무엇을 도와드릴까요?");
		list.add("AI Agent가 무엇인가요?");
		return list;
	}

	@PostMapping(value = "/postmethod", produces = {"application/json", "application/xml"})
	public Board PostMethod() {
		Board board = new Board();
		board.setBno(1);
		board.setBtitle("제목1");
		board.setBcontent("내용1");
		board.setBhitcount(1);
		board.setBwriter("글쓴이1");
		board.setBdate(new Date());
		
		return board;
	}

	@PutMapping(value = "/putmethod", produces = {"application/json", "application/xml"})
	public List<Board> PutMethod() {
	    List<Board> list = new ArrayList<>();
	    for(int i=1; i<=3; i++) {
	    	Board board = new Board();
			board.setBno(i);
			board.setBtitle("제목1"+i);
			board.setBcontent("내용1"+i);
			board.setBhitcount(i);
			board.setBwriter("글쓴이1"+i);
			board.setBdate(new Date());
			list.add(board);
	    	
	    }
	    return list;
	}
	
	@DeleteMapping(value = "/deletemethod", produces = {"application/json", "application/xml"})
	public List<Board> DeleteMethod() {
	    List<Board> list = new ArrayList<>();
	    for(int i=1; i<=3; i++) {
	    	Board board = new Board();
			board.setBno(i);
			board.setBtitle("제목1"+i);
			board.setBcontent("내용1"+i);
			board.setBhitcount(i);
			board.setBwriter("글쓴이1"+i);
			board.setBdate(new Date());
			list.add(board);
	    	
	    }
	    return list;
	}
	
	@GetMapping(value="/contentnego", produces={"application/json", MediaType.APPLICATION_XML_VALUE})
	public List<String> ContentNego() {
		List<String> list = new ArrayList<>();
		list.add("안녕하세요");
		list.add("a무엇을 도와드릴까요?");
		list.add("AI Agent가 무엇인가요?");
		return list;
	}

}
