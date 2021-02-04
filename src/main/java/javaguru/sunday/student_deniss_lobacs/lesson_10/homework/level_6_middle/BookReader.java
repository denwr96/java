package javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_6_middle;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.List;

// task14, task15, task16, task17, task18, task19, task20, task21, task22, task23, task24, task25;
@CodeReview(approved = true)
public interface BookReader {
    boolean addBook(Book book);

    boolean addBookV2(Book book);

    boolean deleteBook(Book book);

    List<String> getBooks();

    List<Book> searchByAuthor(String author);

    List<Book> searchByTitle(String title);

    List<Book> findByAuthorBeginning(String author);

    List<Book> searchByTitleBeginning(String title);

    boolean setBookAsRed(Book book);

    boolean setBookAsNotRed(Book book);

    public List<String> getRedBookList();

    public List<String> getNotRedBookList();
}
