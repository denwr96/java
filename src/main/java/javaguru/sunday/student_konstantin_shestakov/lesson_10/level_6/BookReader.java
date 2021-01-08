package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_6;

// Task 14 - 25

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
@CodeReview(approved = true)
interface BookReader {

    boolean addBook(Book book);

    boolean checkForSameBook(Book book);

    Book findBook(Book book);

    boolean removeBook(Book book);

    void printBookList();

    List<Book> findBookByAuthor(String author);

    List<Book> findBookByAuthorStartsWithWordSearch(String author);

    List<Book> findBookByTitle(String title);

    List<Book> findBookByTitleStartsWithWordSearch(String title);

    boolean bookIsAlreadyRead(Book book);

    boolean bookIsUnread(Book book);

    void printReadBookList();

    void printUnreadBookList();
}

