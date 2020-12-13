package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_6;
//task14
//task15
//task16
//task17
//task18
//task19
//task20
//task21
//task22
//task23
//task24
//task25

import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        BookTest bookTest = new BookTest();

        bookTest.shouldAddNewBook();
        bookTest.shouldNotAddExistingBook();
        bookTest.shouldNotAddBookWithoutAuthor();
        bookTest.shouldRemoveBook();
        bookTest.shouldNotRemoveBook();
        bookTest.printBookList();
        bookTest.shouldFindBookByAuthor();
        bookTest.shouldFindBookByTitle();
        bookTest.shouldFindBookByAuthorsPartName();
        bookTest.shouldMarkAsRead();
        bookTest.shouldNotMarkAsRead();
        bookTest.shouldMarkAsUnread();
        bookTest.shouldNotMarkAsUnread();
        bookTest.shouldFindReadBooks();
        bookTest.shouldFindUnreadBooks();

    }

    BookReader bookReader = new BookReaderImpl();
    Book book1 = new Book("War and Peace", "Leo Tolstoy", false);
    Book book2 = new Book("Evgeniy Onegin", "Aleksandr Pushkin", false);
    Book book3 = new Book("Some title", "", false);
    Book book4 = new Book("Pikovaya dama", "Aleksandr Pushkin", false);
    Book book5 = new Book("War and Peace", "Some Author", false);


    void shouldAddNewBook() {
        boolean actualResult = bookReader.add(book1);
        check(true, actualResult, "Add new book");
    }

    void shouldNotAddExistingBook() {
        boolean actualResult = bookReader.add(book1);
        check(false, actualResult, "Add existing book");
    }

    void shouldNotAddBookWithoutAuthor() {
        boolean actualResult = bookReader.add(book3);
        check(false, actualResult, "Add book without author");
    }

    void shouldRemoveBook() {
        bookReader.add(book2);
        boolean actualResult = bookReader.remove(book2);
        check(true, actualResult, "Remove book from the list");
    }

    void shouldNotRemoveBook(){
        bookReader.add(book2);
        boolean actualResult = bookReader.remove(book4);
        check(false, actualResult, "Remove not existing book in the list");
    }

    void printBookList(){
        bookReader.add(book4);
        bookReader.printBookList();
    }

    void shouldFindBookByAuthor(){
        ArrayList<Book> testList = bookReader.findBookByAuthor("Aleksandr Pushkin");
        System.out.println("Find book by author");
        for (Book foundBook:testList){
            System.out.println(foundBook);
        }
    }

    void shouldFindBookByTitle(){
        bookReader.add(book5);
        ArrayList<Book> testList = bookReader.findBookByTitle("War and Peace");
        System.out.println("Find book by title");
        for (Book foundBook:testList){
            System.out.println(foundBook);
        }
    }

    void shouldFindBookByAuthorsPartName(){
        ArrayList<Book> testList = bookReader.findBookByAuthorPart("Aleksandr");
        System.out.println("Find book by author's part name");
        for (Book foundBook:testList){
            System.out.println(foundBook);
        }
    }

    void shouldMarkAsRead(){
        boolean actualResult = bookReader.markBookIsRead(book1);
        check(true, actualResult, "Mark book as read in the list");
    }

    void shouldNotMarkAsRead(){
        boolean actualResult = bookReader.markBookIsRead(book3);
        check(false, actualResult, "Not mark book that not in the list");
    }

    void shouldMarkAsUnread(){
        boolean actualResult = bookReader.markBookIsNotRead(book4);
        check(true, actualResult, "Mark book as unread in the list");
    }

    void shouldNotMarkAsUnread(){
        boolean actualResult = bookReader.markBookIsNotRead(book3);
        check(false, actualResult, "Not mark book unread that not in the list");
    }

    void shouldFindReadBooks(){
        bookReader.markBookIsRead(book4);
        bookReader.markBookIsRead(book1);
        bookReader.markBookIsRead(book2);
        ArrayList<Book> testList = bookReader.readBookList();
        System.out.println("All read books");
        for (Book foundBook:testList){
            System.out.println(foundBook);
        }
    }

    void shouldFindUnreadBooks(){
        bookReader.markBookIsNotRead(book4);
        bookReader.markBookIsNotRead(book1);
        ArrayList<Book> testList = bookReader.unreadBookList();
        System.out.println("All unread books");
        for (Book foundBook:testList){
            System.out.println(foundBook);
        }
    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
