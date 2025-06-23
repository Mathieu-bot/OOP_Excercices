package oop.bank;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Account {
  private String id;
  private Float balance;
  private Client owner;

  public Account(String id, Client owner) {
    this.id = id;
    this.balance = 0.0f;
    this.owner = owner;
  }

  public void deposit(Float amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Amount must be greater than 0");
    }
    this.balance += amount;
  }

  public void withdraw(Float amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Amount must be greater than 0");
    } else if (this.balance >= amount) {
      this.balance -= amount;
    } else {
      throw new InsufficientFundsException("Insufficient balance");
    }
  }

  public void transfer(Float amount, Account to) {
    if (to == null) {
      throw new IllegalArgumentException("Account to transfer must not be null");
    } else if (to == this) {
      throw new IllegalArgumentException("You can't transfer to yourself");
    }
    if (this.balance >= amount) {
      this.balance -= amount;
      to.deposit(amount);
    } else {
      throw new InsufficientFundsException("Insufficient balance");
    }
  }

  public String consultBalance() {
    return String.format("You have %s in your account", this.balance);
  }
}
