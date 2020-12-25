package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_6;

// Task 14 - 25

import java.util.Optional;

interface BookReader {

    boolean addBook(Book book);

    boolean checkForSameBook(Book book);

    boolean checkBookAuthor(Book book);

    boolean checkBookTitle(Book book);

    Book findBook(Book book);

    boolean removeBook(Book book);

    void printBookList();

    Book[] findBookByAuthor(String author);

    Book[] findBookByAuthorPartialWordSearch(String author);

    Book[] findBookByTitle(String title);

    Book[] findBookByTitlePartialSearch(String title);

    boolean bookIsAlreadyRead(Book book);

    boolean bookIsUnread(Book book);

    void printReadBookList();

    void printUnreadBookList();
}

