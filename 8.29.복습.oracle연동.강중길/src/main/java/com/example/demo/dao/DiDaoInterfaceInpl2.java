package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class DiDaoInterfaceInpl2 implements DiDaoInterface {
	
	public DiDaoInterfaceInpl2() {
		log.info("실행");
	}

	@Override
	public void insert() {
		log.info("DiDaoInterfaceInpl2에서 행 삽입");
		
	}

}
