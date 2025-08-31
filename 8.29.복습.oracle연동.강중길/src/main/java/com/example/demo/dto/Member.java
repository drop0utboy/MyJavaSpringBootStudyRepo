package com.example.demo.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Member {
//	@NotBlank(message = "아이디는 공백일 수 없습니다") 최소
    @Size(min = 5, max = 20, message = "아이디는 5자 이상 20자 이하로 입력해야 합니다")
	private String mid;
    @NotBlank(message = "이름은 공백일 수 없습니다")
	private String mname;
    @NotNull
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "비밀번호는 최소 8자 이상, 대문자/소문자/숫자/특수문자를 모두 포함해야 합니다"
        )
	private String mpassword;
    @Email
	private String memail;
    @Pattern(
            regexp = "^01[0-9]-?\\d{3,4}-?\\d{4}$",
            message = "휴대전화번호 형식이 올바르지 않습니다. 예: 010-1234-5678"
        )
	private String mtel;
    @NotBlank(message = "주민등록번호는 필수 입력입니다")
    @Pattern(
        regexp = "^\\d{6}-\\d{7}$",
        message = "주민등록번호 형식이 올바르지 않습니다. 예: 900101-1234567"
    )
	private String mssn;
    
    private boolean menabled;
    private String mrole;
    
}



//create table member (
//mid varchar(20) primary key, 
//mname varchar(20) not null,
//mpassword varchar(200) not null,
//menabled number(1,0) not null,
//mrol varchar(10) not null,
//memail varchar(100)not null
//);