package com.example.demo.controller;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// UI와 관계 없으니 Rest 컨트롤러 사용
@RestController
public class ExceptionController {
  @RequestMapping("/exception-kind")
  public String exceptionKind() {

    if (true) {
      try {
        throw new NullPointerException();
      } catch (NullPointerException e) { // 예외가 처리되어도 여기 catch 부분부터 계속 실행
        System.out.println("나 실행 됨?");
      } finally { // 무조건 실행!항상 실행!
        System.out.println("여전히 나 실행 됨?");
      }
    }
    return "예외 종류";
  }

  @RequestMapping("/multi-catch")
  public String multiCatch() {
    try {
      // 일반 예외
      Class.forName("java.lang.Strㅇing"); // java.lang.String이라는 클래스를 찾습니다
//      System.out.println("클래스 있음!");

      // 런타임 예외
      String data = "10";
      int value = Integer.parseInt(data);

      String name = null;
      name.equals("홍길동");

    } catch (ClassNotFoundException e) { // 예외가 처리되어도 여기 catch 부분부터 계속 실행
      System.out.println("클래스 음슴 ㅇㅅㅇ");
    } catch (Exception e) { // 얘는 모든 예외를 처리
      System.out.println("아무튼 예외 처리됨!");
    }

    return "여러 가지 예외 처리";
  }

  @RequestMapping("/throws")
  public String throwsMethod() {
    try {
      saveFile("C:/Temp/content.txt");
    } catch (IOException e) {
      System.out.println("폴더 음슴");
    }
    return "예외 떠넘기기";
  }

  private void saveFile(String filePath) throws IOException {
    String content = "오늘은 토요일, 다른 사람이 놀때, 열심히 하면 성공합니다.";
    FileWriter fw = new FileWriter(filePath);
    fw.write(content);
    fw.flush();
    fw.close();
    System.out.println("파일이 생성되었거나 이미 존재합니다.");
  }

}
