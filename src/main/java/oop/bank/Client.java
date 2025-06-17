package oop.basic;

public class Client {
  private String id;
  private String firstName;
  private String lastName;
  private String address;
  private String phone;
  private String email;
  private String city;
  private String state;

  public Client(String firstName, String id, String lastName, String address, String email, String phone, String city, String state) {
    this.firstName = firstName;
    this.id = id;
    this.lastName = lastName;
    this.address = address;
    this.email = email;
    this.phone = phone;
    this.city = city;
    this.state = state;
  }

  public Client(String id, String firstName, String lastName, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public String getId() {
    return id;
  }

  public String getFirstName() {return firstName;}

  public String getName() {
    return firstName + " " + lastName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {return email;}

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setState(String state) {
    this.state = state;
  }
}
