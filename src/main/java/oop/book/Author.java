package oop.book;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class Author {
  private String id;
  private String firstName;
  private String lastName;
  private String surname;
  private LocalDate birthDate;
  private Gender gender;
  private String country;

  public enum Gender {
    MALE, FEMALE, UNKNOWN;
  }
}
