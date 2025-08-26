package com.example.demo.controller;

import com.example.demo.dto.User;

import lombok.extern.slf4j.Slf4j;

import com.example.demo.dto.Result;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {

	@PostMapping("/submit-user")
	public int handleUser(@RequestBody User user) {
		// 입력 로그 찍어보기
		log.info("이름", user.getUname());
		log.info("년도", user.getUyear());
		log.info("월", user.getUmonth());
		log.info("일", user.getUday());
		// 1. 생년 + 월 + 일
		int total = user.getUyear() + user.getUmonth() + user.getUday();
		// 2. 자릿수 합
		int sum = sumDigits(total);
		// 3. 조건 처리
		if (sum == 22)
			return 0;
		if (sum < 22)
			return sum;
		return sumDigits(sum); // 22 초과면 한 번 더 자릿수 합
	}

	// 사용자 이름 + 결과를 받아서 페이지로 리디렉션
	@PostMapping("/submit-result")
	public String submitResult(@RequestBody Result result) {
		return "/result-page?rname=" + result.getRname() + "&rresult=" + result.getRresult();
	}

	// Get방식 사용했던것
//	@GetMapping("/result-page")
//	public String resultPage(
//			@RequestParam("rname") String rname, 
//			@RequestParam("rresult") int rresult
//			) {
//		return rname + "님을 상징하는 타로 카드는 " + rresult + "번입니다.";
//	}
	
	// 연산 결과로 나온 카드 번호와 입력받았던 사용자명을 매핑
	// 이때 User dto에서 uname을 꺼내 쓰는대신, 굳이 uname을 다시 Result dto의 rname에 넣어서 사용
//	@PostMapping("/result-page")
//	public String resultPage(@RequestBody Result result) {
//	    return result.getRname() + "님을 상징하는 타로 카드는 " + result.getRresult() + "번입니다.";
//	}
	
	// 이미지를 가져오기 위해 대부분을 html에서 처리
	@PostMapping("/result-page")
	public Result resultPage(@RequestBody Result result) {
	    return result; // 그대로 JSON으로 응답
	}

	// 헬퍼 함수: 자릿수 합 구하기
	private int sumDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
}
