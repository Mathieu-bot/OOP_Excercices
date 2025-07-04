package oop.book;

import java.time.LocalDate;

public class LibraryTest {

    Author author1 = new Author("A1", "Victor Hugo", "François", "Hug", LocalDate.of(1949, 6, 24), Author.Gender.MALE, "Mada");
    Author author2 = new Author("A2", "Victor", "Rabe", "Vic", LocalDate.of(2000, 7, 4), Author.Gender.MALE, "France");

    Book book1 = new Book(
      "B1",
      "Les Misérables",
      1232,
      LocalDate.of(1949, 6, 24),
      "Un roman historique sur la justice, la rédemption et la misère.",
      BookType.ROMANCE,
      author1
    );

    Book book2 = new Book(
      "B2",
      "1984",
      328,
      LocalDate.of(2000, 4, 22),
      "Un roman dystopique sur la surveillance et la dictature.",
      BookType.THRILLER,
      author2
    );

}
