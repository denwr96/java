package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level2.task6;

//Task 6 --> Task 14

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

interface BookDatabase {

    List<Book> bookList = new ArrayList<>();

    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String author);
    int countAllBooks();
    void deleteByAuthor(String author);
    void deleteByTitle(String title);

}
