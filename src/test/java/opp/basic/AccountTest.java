package opp.basic;

import oop.basic.Account;
import oop.basic.Client;
import oop.basic.InsufficientFundsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

  private Account account1;
  private Account account2;
  private Client client1;
  private Client client2;

  @BeforeEach
  void setup() {
    client1 = new Client("001", "Alice", "DOE", "alice@mail.com");
    client2 = new Client("002", "Bob", "BOB", "bob@mail.com");
    account1 = new Account("AC001", 1000.0f, client1);
    account2 = new Account("AC002", 500.0f, client2);
  }

  @Test
  void testGetId() {
    assertEquals("AC001", account1.getId());
  }

  @Test
  void testSetId() {
    account1.setId("AC003");
    assertEquals("AC003", account1.getId());
  }

  @Test
  void testGetBalance() {
    assertEquals(1000.0f, account1.getBalance());
  }

  @Test
  void testGetOwner() {
    assertEquals(client1, account1.getOwner());
    assertEquals("Alice", account1.getOwner().getName());
  }

  @Test
  void testDeposit() {
    account1.deposit(200.0f);
    assertEquals(1200.0f, account1.getBalance());
  }

  @Test
  void testWithdraw() {
    account1.withdraw(300.0f);
    assertEquals(700.0f, account1.getBalance());
  }

  @Test
  void testTransfer() {
    account1.transfer(400.0f, account2);
    assertEquals(500.0f, account1.getBalance(), "balance of sender shouldn't change since withdraw isn't done");
    assertEquals(900.0f, account2.getBalance());
  }

  @Test
  void testThrowsTransferExceptionIfBalanceIsNotEnough() {
    InsufficientFundsException exception = assertThrows(InsufficientFundsException.class,
      () -> account1.transfer(1100.0f, account2));
    assertEquals("Insufficient balance", exception.getMessage());
  }

  @Test
  void testThrowsWithdrawExceptionIfBalanceIsNotEnough() {
    InsufficientFundsException exception = assertThrows(InsufficientFundsException.class,
      () -> account1.withdraw(1000.01f));
    assertEquals("Insufficient balance", exception.getMessage());
  }
}
