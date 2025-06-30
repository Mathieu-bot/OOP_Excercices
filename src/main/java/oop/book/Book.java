package oop.book;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class Book {
  private String id;
  private String title;
  private int pages;
  private LocalDate releaseDate;
  private String resume;
  private BookType bookType;
  private Author author;

  @Override
  public String toString() {
    return String.format("Book id: %s, title: %s , pages: %s , releaseDate: %s", id, title, pages, releaseDate);
  }
}
