package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Account;
import com.example.demo.dto.ErrorMessage;
import com.example.demo.exception.AccountNotEmptyException;
import com.example.demo.exception.NotEnoughBalanceException;
import com.example.demo.exception.NotExistAccountException;
import com.example.demo.exception.TooManyAccountsException;

// UI부분을 사용하지 않으니 Rest컨트롤러 사용
@RestController
public class BankController {

  // Field
  // 계좌 최대 갯수 지정
  int max_count = 10;

  private Account[] accounts = new Account[max_count];

  // Constructor

  // Method
 @RequestMapping("/createAccount")
  public Account createAccount(@RequestParam("ano") String ano) throws TooManyAccountsException { // ano 값을 받아서 객체를 만듬
    Account account = new Account();
    account.setAno(ano);

    int account_number = 0;

    // 현재 생성되어 있는(채워진) 계좌 수를 센다.
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null) {
        account_number++;
      }
    }

    // 계좌가 가득 찬 경우 throw
    if (account_number >= max_count) {
      System.out.println("에러코드 cr-03");
      throw new TooManyAccountsException(max_count + "개를 넘는 계좌는 만들 수 없습니다.");
    }

    // 빈 칸 찾아서 저장
    for (int j = 0; j < accounts.length; j++) {
      if (accounts[j] == null) {
        accounts[j] = account;
        System.out.println("생성 성공");
        break;
      }
    }

    return account;
  }

  public Account findAccount(String ano) throws NotExistAccountException {
    Account account = null;

    for (int i = 0; i < accounts.length; i++) {
      // 저장된 계좌의 수를 체크하기 위해 1씩 증가

      if (accounts[i] != null && accounts[i].getAno().equals(ano)) {
        account = accounts[i];
        System.out.println("계좌 생성 성공");
        break;
      }
    }

    if (account == null) {
      // null을 리턴하는 대신 예외 발생 시키기(throw) 참고 : throw와 throws는 그냥 용법이 아예 다름!
      System.out.println("에러코드 cr-01");
      throw new NotExistAccountException(ano + "가 없음!"); // 에러 메시지를 강제로 발생 시켰으므로 코드는 여기서 종료
    }
    return account;
  }

  // 계좌 삭제 기능
  @RequestMapping("/deleteAccount")
  public Object deleteAccount(@RequestParam("ano") String ano) throws NotExistAccountException, AccountNotEmptyException {
    for (int i = 0; i < accounts.length; i++) {
      // 잔고가 0이 아닐때 계좌 삭제 방지
      if (accounts[i] != null && accounts[i].getAno().equals(ano)) {
        Account account = findAccount(ano);
        if (account.getBalance() != 0) {
          throw new AccountNotEmptyException("계좌가 비어있지 않음!");
        }

        accounts[i] = null;
        System.out.println("계좌 삭제 성공");

        Map<String, String> res = new HashMap<>();
        res.put(ano, " 계좌 삭제 성공");
        return res;

      }
    }
    // 없으면 반드시 에러가 발생해야 하므로 if문 아니게 만듬
    System.out.println("에러코드 cr-01");
    throw new NotExistAccountException(ano + "가 없음!"); // 에러 메시지를 강제로 발생 시켰으므로 코드는 여기서 종료
  }

  @RequestMapping("/deposit")
  public Object deposit(@RequestParam("ano") String ano, @RequestParam("amount") int amount) {
    try {
      Account account = findAccount(ano);
      account.setBalance(account.getBalance() + amount);

      return account;

    } catch (NotExistAccountException e) {
      // 계좌가 없을때
      System.out.println(e.getMessage());
      System.out.println("에러코드 de-01");

      ErrorMessage errorMessage = new ErrorMessage();
      errorMessage.setError(e.getMessage());
      return errorMessage;

      // 발생할 리 없는 오류인데 의존성 때문에 잡아줘야만 함
    }
  }

  @RequestMapping("/withdraw")
  public Object withdraw(@RequestParam("ano") String ano, @RequestParam("amount") int amount) {
    try {
      Account account = findAccount(ano);

      if (account.getBalance() < amount) {
        throw new NotEnoughBalanceException("잔고 부족!");
      }

      account.setBalance(account.getBalance() - amount);
      return account;

    } catch (NotExistAccountException e) {
      // 해당하는 계좌가 없을때
      System.out.println(e.getMessage());
      System.out.println("에러코드 wi-01");

      ErrorMessage errorMessage = new ErrorMessage();
      errorMessage.setError(e.getMessage());

      return errorMessage;

      // 잔고가 부족할때
    } catch (NotEnoughBalanceException e) {
      System.out.println(e.getMessage());
      System.out.println("에러코드 wi-02");

      ErrorMessage errorMessage = new ErrorMessage();
      errorMessage.setError(e.getMessage());

      return errorMessage;

    } catch (Exception e) {
      System.out.println(e.getMessage());

      ErrorMessage errorMessage = new ErrorMessage();
      errorMessage.setError(e.getMessage());

      return errorMessage;

    }
  }
}
