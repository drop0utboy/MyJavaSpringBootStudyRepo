package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class DiDao1 {
	public DiDao1() {
		log.info("실행Dao1");
	}
	
	public void insert() {
		log.info("행삽입");
	}
}
