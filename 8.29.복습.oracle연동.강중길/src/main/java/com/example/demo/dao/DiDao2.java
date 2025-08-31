package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class DiDao2 {
	public DiDao2() {
		log.info("실행Dao2");
	}
	
	public void insert() {
		log.info("행삽입");
	}
}
