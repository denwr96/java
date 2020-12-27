package javaguru.sunday.student_sergej_savkin.lesson_10.level_6_middle.task_14_25;

import javaguru.sunday.teacher.annotations.CodeReview;

//task14to25
@CodeReview(approved = true)
interface BookReader {

    boolean checkIfBookAlreadyAdded(Book book);

    boolean addBook(Book book);

    boolean checkIfBookHasTitleAndAuthor(Book book);

    boolean deleteBook(Book book);

    String[] showBookList(Book[] book);

    Book[] searchByAuthor(String author);

    Book[] searchByAuthorBeginning(String authorBeginning);

    Book[] searchByTitle(String title);

    Book[] searchByTitleBeginning(String titleBeginning);

    boolean setBookAsRed(Book book);

    boolean setBookAsNotRed(Book book);

    String[] getRedBookList(Book[] book);

    String[] getNotRedBookList(Book[] book);

}
