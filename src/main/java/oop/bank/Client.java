package oop.bank;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Client {
  private String id;
  private String firstName;
  private String lastName;
  private String address;
  private String phone;
  private String email;
  private String city;
  private String state;

  public Client(String id, String firstName, String lastName, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }
}
