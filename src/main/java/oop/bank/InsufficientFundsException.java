package oop.basic;

public class InsufficientFundsException extends RuntimeException {
  public InsufficientFundsException(String message) {
    super(message);
  }
}
