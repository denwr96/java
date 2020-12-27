package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.BookReader;

// lesson_10 task_14
// lesson_10 task_15
// lesson_10 task_16
// lesson_10 task_17
// lesson_10 task_18
// lesson_10 task_19
// lesson_10 task_20
// lesson_10 task_21
// lesson_10 task_22
// lesson_10 task_23
// lesson_10 task_24
// lesson_10 task_25

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
@CodeReview(approved = true)
public interface BookReader {
    boolean checkBookTitleAuthor (Book book);
    boolean addBookToLibrary(Book book);
    boolean deleteBookFromLibrary(Book book);
    ArrayList<Book> findBookByAuthor(String bookAuthor);
    ArrayList<Book> findBookByNotFullAuthorsName(String tryingToFindAuthor);
    ArrayList<Book> findBookByTitle(String bookTitleToFind);
    ArrayList<Book> findBookByNotFullTitle(String tryingToFindBook);
    boolean markBookAsRead(Book book);
    boolean markBookAsUnRead(Book book);
    ArrayList<Book> readBooksList();
    ArrayList<Book> unReadBooksList();
}
