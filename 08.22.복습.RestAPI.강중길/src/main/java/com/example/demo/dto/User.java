package com.example.demo.dto;

import lombok.Data;

@Data
public class User {
	// 대문자로 선언해주면 나중에 매핑할때 문제가 생긴다
	private String uname;
	private int uyear;
	private int umonth;
	private int uday;
}
