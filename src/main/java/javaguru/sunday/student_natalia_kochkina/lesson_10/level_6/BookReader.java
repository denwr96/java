package javaguru.sunday.student_natalia_kochkina.lesson_10.level_6;

//Task_14
//Task_15
//Task_16
//Task_17
//Task_18
//Task_19
//Task_20
//Task_21
//Task_22
//Task_23
//Task_24
//Task_25

import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.List;

@CodeReviewComment(comment = "Public можно не писать в интерфейсах")
public interface BookReader {

    boolean checkTheSameBook(Book book);

    boolean validateBook(Book book);

    boolean addBook(Book newBook);

    Book findBook(Book usersBook);

    boolean deleteBook(Book book);

    List<String> booksAuthorAndTitle();

    List<Book> searchByAuthor(String author);

    List<Book> searchByPartOfAuthor(String author);

    List<Book> searchBookByTitle(String title);

    List<Book> searchByPartOfTitle(String title);

    boolean bookWasRead(Book book);

    boolean bookWasNotRead(Book book);

    List<String> booksWasReadList();

    List<String> unreadBooksList();

}
