package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_2;
//task6
//task7
//task8
//task9
//task10
//task11
//task12
//task13
//task14

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Optional;
@CodeReview(approved = true)
public interface BookDatabase {
    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);
}
