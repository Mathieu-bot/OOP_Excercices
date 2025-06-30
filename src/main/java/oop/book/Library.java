package oop.book;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class Library {
  private String id;
  private String name;
  private String address;
  private String city;
  private List<Book> books;

  void addBook(Book book) {
    if (books == null) {
      throw new IllegalArgumentException("Book cannot be null");
    }
    this.books.add(book);
  }

  void removeBook(String identifier) {
    if (identifier == null) {
      throw new IllegalArgumentException("Book cannot be null");
    }
    this.books.removeIf(book -> book.getId().equals(identifier));
  }

  List<Book> getBooks() {
    return books.stream()
      .sorted(Comparator.comparing(Book::getTitle))
      .collect(Collectors.toList());
  }

  List<Book> findBook(String titleOrKeyword) {
    return books.stream()
      .filter(book ->
        book.getTitle().equals(titleOrKeyword) || book.getResume().toLowerCase().contains(titleOrKeyword.toLowerCase()))
      .collect(Collectors.toList());
  }

  List<Book> findBook(BookType type) {
    return books.stream()
      .filter(book -> book.getBookType().equals(type))
      .collect(Collectors.toList());
  }

  Set<Author> listAuthor() {
    return books.stream()
      .map(Book::getAuthor)
      .collect(Collectors.toSet());
  }
//
//  Map<BookType, Integer> countBooks() {
//    return books.stream()
//  }
}