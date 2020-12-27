package javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle;

import java.util.ArrayList;

// task14, task15, task16, task17, task18, task19, task20, task21, task22, task23, task24, task25;

public interface BookReader {
    void addBook(Book book) throws BookAlreadyExistsException;

    boolean addBookV2(Book book);

    boolean deleteBook(Book book);

    ArrayList<String> getBooks();

    ArrayList<Book> searchByAuthor(String author);

    ArrayList<Book> searchByTitle(String title);

    ArrayList<Book> findByAuthorBeginning(String author);

    ArrayList<Book> searchByTitleBeginning(String title);

    boolean setBookAsRed(Book book);

    boolean setBookAsNotRed(Book book);

    public ArrayList<String> getRedBookList();

    public ArrayList<String> getNotRedBookList();
}
