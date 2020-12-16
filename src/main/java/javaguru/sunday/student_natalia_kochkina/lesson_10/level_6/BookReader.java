package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_6;

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

import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
@CodeReviewComment(comment = "Public можно не писать в интерфейсах")
public interface BookReader {

    public boolean addBook(Book book);

    public boolean checkAuthor(Book book);

    public boolean checkTheSameBook(Book book);

    public boolean deleteBook(Book book);

    public ArrayList<String> listOfTheBooks();

    public ArrayList<Book> findBookByAuthor(String author);

    public ArrayList<Book> findBookByFirstLettersOfAuthor(String author);

    public ArrayList<Book> findBookByTitle(String title);

    public  ArrayList<Book> findBookByFirstLettersOfTitle(String title);

    public boolean bookWasRead(Book book);

    public boolean bookWasNotRead(Book book);

    public ArrayList<String> booksIWasRead();

    public ArrayList<String> booksIWasNotRead();

}
