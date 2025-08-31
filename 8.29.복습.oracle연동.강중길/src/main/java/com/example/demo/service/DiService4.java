package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DiDaoInterface;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DiService4 {
//	@Autowired
//	@Qualifier("diDaoInterfaceImpl2")
//	private DiDaoInterface diDaoInterface;
//	
//	public DiService4(DiDaoInterface diDaoInterface) {
//		log.info("실행");
//	}
	
	
	
	//생성자 주입
	private DiDaoInterface diDaoInterface;
	
	public DiService4(@Qualifier("diDaoInterfaceInpl1") DiDaoInterface diDaoInterface) {
		this.diDaoInterface = diDaoInterface;
	}
	
	public void add() {
		log.info("실행 dis4");
		diDaoInterface.insert();
	}
}
