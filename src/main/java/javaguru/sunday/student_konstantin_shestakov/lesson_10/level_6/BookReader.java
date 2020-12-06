package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_6;

// Task 14 - 25

import java.util.Optional;

interface BookReader {

    boolean addBook(Book book);

    boolean checkForSameBook(Book book);

    public boolean checkBookAuthor(Book book);

    public boolean checkBookTitle(Book book);

    public Book findBook(Book book);

    public boolean removeBook(Book book);

    void printBookList();

    public Book[] findBookByAuthor(String author);

    public Book[] findBookByAuthorPartialWordSearch(String author);

    public Book[] findBookByTitle(String title);

    public Book[] findBookByTitlePartialSearch(String title);

    public boolean bookIsAlreadyRead(Book book);

    public boolean bookIsUnread(Book book);

    void printReadBookList();

    void printUnreadReadBookList();
}

