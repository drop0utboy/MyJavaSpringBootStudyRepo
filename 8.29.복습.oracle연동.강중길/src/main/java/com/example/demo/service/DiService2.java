package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DiDao1;
import com.example.demo.dao.DiDao2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DiService2 {
	private DiDao1 diDao1;
	private DiDao2 diDao2;
	
	// 생성자 주입
	public DiService2(DiDao1 diDao1, DiDao2 diDao2 ) {
		log.info("실행1");
		this.diDao1 = diDao1;
		this.diDao2 = diDao2;
	}
	
	public void add() {
		log.info("실행4");
		diDao1.insert();
		diDao2.insert();
	}
}
