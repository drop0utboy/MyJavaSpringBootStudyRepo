package com.example.demo.Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController // 값만 출력하면 되므로 레스트컨트롤러 채용
public class BufferReaderController {

    // api로 json 받아오는 클래스
    @RequestMapping("/savejsonfile")
    public String SaveJsonFile() throws IOException { // IO예외처리

        // url 주소 문자열에 집어넣기
        // String api = "https://api.quotable.io/random"; // 처음에 선정한 사이트는 인증서 이슈가 있어서
        // 폐기. 그냥 무시하고 쓸 수도 있으나 보안을 위해서 다른 사이트로 대체
        String api = "https://dummyjson.com/quotes/random"; // 랜덤한 문장을 json으로 반환하는 더미 API 사이트
        // 일반적인 API의 경우, 대체로 get방식으로 데이터의 종류나 출력값의 수, xml이나 json등의 타입도 정해서 가져올 수 있음 
        // 이번에는 단순하게 사용하기 위해 반드시 json하나만 랜덤으로 반환하는 사이트 사용

        // 사이트에 연결해서 값 가져오기
        URL url = new URL(api);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET"); // Get방식

        // 입력 스트림 버퍼리더로 가져오기
        InputStream is = con.getInputStream(); // 바이트 단위로 가져옴
        InputStreamReader isr = new InputStreamReader(is); // 바이트 스트림을 문자 스트림으로 변환
        BufferedReader br = new BufferedReader(isr); // 버퍼리더로 다시 변환

        // 해당 api의 json은 한줄짜리라 readLine() 한 번에 가져오기 가능
        // 실제로는 가져오는 데이터의 타입과 형태에 맞춰서 가져올 필요성이 있음
        String jsonLine = br.readLine();

        // 다 담았으니 일단 스트림 닫기, br만 닫으면 그 위의 io닫기 가능
        br.close();
        // 연결 해제
        con.disconnect();

        // JSON 파싱
        // objectMapper는 Jackson라이브러리에서 제공하는 클래스
        ObjectMapper mapper = new ObjectMapper();
        JsonNode json = mapper.readTree(jsonLine);

        // 파일에 value만 한 줄씩 저장
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Temp/data_study.db", true))) { 
                // append true는 연속쓰기 설정
            json.fields().forEachRemaining(entry -> { // 남아있는 모든 쌍에대한 순환 처리 람다식
                try {
                    bw.write(entry.getValue().toString()); // Entry에서 값만 꺼내오기
                    bw.newLine(); // 줄바꿈 추가
                } catch (IOException e) {
                    throw new RuntimeException(e); // 예외처리
                }
            });

        }
        return "저장 완료";
    }

    // 역으로 출력하는 기능
    @RequestMapping("/printdb")
    public String Printdb() {
        try (
                FileReader fr = new FileReader("C:/Temp/data_study.db"); //리더스트림 선언
                BufferedReader br = new BufferedReader(fr)) {  //버퍼리더로 감싸기
            String line = null; // 문자열 담을 변수 선언
            while (true) {
                line = br.readLine(); // 한줄씩 읽어오기
                if (line == null) { // 더 이상 읽을게 없으면 종료
                    break;
                }
                System.out.println(line); // 콘솔에 출력
            }
        } catch (IOException e) { //예외처리
            e.printStackTrace();
            return "읽기 실패: " + e.getMessage();
        }

        return "콘솔 출력 완료";
    }
}




