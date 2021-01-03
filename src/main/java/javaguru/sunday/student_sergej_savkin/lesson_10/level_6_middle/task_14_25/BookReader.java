package javaguru.sunday.student_sergej_savkin.lesson_10.level_6_middle.task_14_25;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;

//task14to25
@CodeReview(approved = true)
interface BookReader {

    boolean checkIfBookAlreadyAdded(Book book);

    boolean addBook(Book book);

    boolean checkIfBookHasTitleAndAuthor(Book book);

    boolean deleteBook(Book book);

    List<String> showBookList(List<Book> books);

    List<Book> searchByAuthor(String author);

    List<Book> searchByAuthorBeginning(String authorBeginning);

    List<Book> searchByTitle(String title);

    List<Book> searchByTitleBeginning(String titleBeginning);

    boolean setBookAsRed(Book book);

    boolean setBookAsNotRed(Book book);

    List<String> getRedBookList(List<Book> book);

    List<String> getNotRedBookList(List<Book> book);

}
