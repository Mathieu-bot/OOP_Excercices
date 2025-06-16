package oop.basic;

public class Account {
  private String id;
  private Float balance;
  private final Client owner;

  public Account(String id, Float balance, Client owner) {
    this.id = id;
    this.balance = balance;
    this.owner = owner;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Float getBalance() {
    return balance;
  }

  public Client getOwner() {
    return owner;
  }

  public void deposit(Float amount) {
    this.balance += amount;
  }

  public void withdraw(Float amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
    } else {
      throw new InsufficientFundsException("Insufficient balance");
    }
  }

  public void transfer(Float amount, Account to) {
    if (this.balance >= amount) {
      this.balance -= amount;
      to.deposit(amount);
    } else {
      throw new InsufficientFundsException("Insufficient balance");
    }
  }
}
