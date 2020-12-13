package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level6.task14;

//Task 14 -> 25

import java.util.ArrayList;

interface BookReader {


    boolean bookHasAuthorAndTitle(Book newBook);

    boolean addBook(Book newBook);

    boolean removeBook(Book bookToRemove);

    String[] availableBooks();

    ArrayList<Book> bookListByAuthor(String requestedAuthor);

    ArrayList<Book> bookListByPartOfAuthorName(String partOfRequestedAuthorName);

    ArrayList<Book> bookListByTitle(String requestedTitle);

    ArrayList<Book> bookListByPartOfTitle(String partOfRequestedTitle);

    boolean markAsRead(Book bookToMark);

    boolean markAsUnread(Book bookToMark);

    ArrayList<Book> listOfReadBooks();

    ArrayList<Book> listOfUnreadBooks();

}
