package com.example.demo.exception;

public class NotEnoughBalanceException extends RuntimeException {
  //Field
  
  //Constructor
  public NotEnoughBalanceException( ) {
    
  }
  
  public NotEnoughBalanceException(String message) {
    super(message);
  }
  
  //Method

}
