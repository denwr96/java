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
import java.util.List;

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
//        bookTest.shouldFindBookByAuthorsPartName();
//        bookTest.shouldMarkAsRead();
//        bookTest.shouldNotMarkAsRead();
//        bookTest.shouldMarkAsUnread();
//        bookTest.shouldNotMarkAsUnread();
//        bookTest.shouldFindReadBooks();
//        bookTest.shouldFindUnreadBooks();

    }

    Book book1 = new Book("War and Peace", "Leo Tolstoy", false);
    Book book2 = new Book("Evgeniy Onegin", "Aleksandr Pushkin", false);
    Book book3 = new Book("Some title", "", false);
    Book book4 = new Book("Pikovaya dama", "Aleksandr Pushkin", false);
    Book book5 = new Book("War and Peace", "Some Author", false);


    void shouldAddNewBook() {
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());

        boolean actualResult = victim.add(book1);
        check(true, actualResult, "Add new book");
    }

    void shouldNotAddExistingBook() {
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book1);

        boolean actualResult = victim.add(book1);
        check(false, actualResult, "Add existing book");
    }

    void shouldNotAddBookWithoutAuthor() {
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());

        boolean actualResult = victim.add(book3);
        check(false, actualResult, "Add book without author");
    }

    void shouldRemoveBook() {
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book2);

        boolean actualResult = victim.remove(book2);
        check(true, actualResult, "Remove book from the list");
    }

    void shouldNotRemoveBook(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book2);

        boolean actualResult = victim.remove(book4);
        check(false, actualResult, "Remove not existing book in the list");
    }

    void printBookList(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book4);
        victim.printBookList();
    }

    void shouldFindBookByAuthor(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book2);
        victim.add(book4);

        List<Book> testList = victim.findBookByAuthor("Aleksandr Pushkin");
        System.out.println("Find book by author");
        for (Book foundBook:testList){
            System.out.println(foundBook);
        }
    }

    void shouldFindBookByTitle(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        //TODO: Fix Tests
        victim.add(book5);
        ArrayList<Book> testList = victim.findBookByTitle("War and Peace");
        System.out.println("Find book by title");
        for (Book foundBook:testList){
            System.out.println(foundBook);
        }
    }

//    void shouldFindBookByAuthorsPartName(){
//        ArrayList<Book> testList = victim.findBookByAuthorPart("Aleksandr");
//        System.out.println("Find book by author's part name");
//        for (Book foundBook:testList){
//            System.out.println(foundBook);
//        }
//    }
//
//    void shouldMarkAsRead(){
//        boolean actualResult = victim.markBookIsRead(book1);
//        check(true, actualResult, "Mark book as read in the list");
//    }
//
//    void shouldNotMarkAsRead(){
//        boolean actualResult = victim.markBookIsRead(book3);
//        check(false, actualResult, "Not mark book that not in the list");
//    }
//
//    void shouldMarkAsUnread(){
//        boolean actualResult = victim.markBookIsNotRead(book4);
//        check(true, actualResult, "Mark book as unread in the list");
//    }
//
//    void shouldNotMarkAsUnread(){
//        boolean actualResult = victim.markBookIsNotRead(book3);
//        check(false, actualResult, "Not mark book unread that not in the list");
//    }
//
//    void shouldFindReadBooks(){
//        victim.markBookIsRead(book4);
//        victim.markBookIsRead(book1);
//        victim.markBookIsRead(book2);
//        ArrayList<Book> testList = victim.readBookList();
//        System.out.println("All read books");
//        for (Book foundBook:testList){
//            System.out.println(foundBook);
//        }
//    }
//
//    void shouldFindUnreadBooks(){
//        victim.markBookIsNotRead(book4);
//        victim.markBookIsNotRead(book1);
//        ArrayList<Book> testList = victim.unreadBookList();
//        System.out.println("All unread books");
//        for (Book foundBook:testList){
//            System.out.println(foundBook);
//        }
//    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
