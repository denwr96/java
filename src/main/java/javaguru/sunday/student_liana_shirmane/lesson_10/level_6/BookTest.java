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
        bookTest.shouldNotAddBookWithoutName();
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

    Book book1 = new Book("War and Peace", "Leo Tolstoy", false);
    Book book2 = new Book("Evgeniy Onegin", "Aleksandr Pushkin", false);
    Book book3 = new Book("Some title", "", false);
    Book book4 = new Book("Pikovaya dama", "Aleksandr Pushkin", false);
    Book book5 = new Book("War and Peace", "Some Author", false);
    Book book6 = new Book("", "Some Author", false);


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
        check(true, actualResult, "Add book without author");
    }

    void shouldNotAddBookWithoutName() {
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());

        boolean actualResult = victim.add(book6);
        check(true, actualResult, "Add book without name");
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
        victim.add(book1);

        List<Book> testList = victim.findBookByAuthor("Aleksandr Pushkin");

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book4);
        expectedList.add(book2);
        boolean actualResult = checkCollectionEquals(testList, expectedList);
        check(true, actualResult, "Find book by author");
    }

    void shouldFindBookByTitle(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book1);
        victim.add(book5);
        victim.add(book2);

        List<Book> testList = victim.findBookByTitle("War and Peace");

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book5);
        expectedList.add(book1);
        boolean actualResult = checkCollectionEquals(testList, expectedList);
        check(true, actualResult, "Find book by title");
    }

    void shouldFindBookByAuthorsPartName(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book1);
        victim.add(book2);
        victim.add(book4);
        victim.add(book5);

        List<Book> testList = victim.findBookByAuthorPart("Aleksandr");


        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book4);
        expectedList.add(book2);
        boolean actualResult = checkCollectionEquals(testList, expectedList);
        check(true, actualResult, "Find book by author's part name");
    }

    void shouldMarkAsRead(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book1);

        boolean actualResult = victim.markBookIsRead(book1);
        check(true, actualResult, "Mark book as read in the list");
    }

    void shouldNotMarkAsRead(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book1);

        boolean actualResult = victim.markBookIsRead(book2);
        check(false, actualResult, "Not mark book that not in the list");
    }

    void shouldMarkAsUnread(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book4);

        boolean actualResult = victim.markBookIsNotRead(book4);
        check(true, actualResult, "Mark book as unread in the list");
    }

    void shouldNotMarkAsUnread(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());

        boolean actualResult = victim.markBookIsNotRead(book4);
        check(true, actualResult, "Not mark book unread that not in the list");
    }

    void shouldFindReadBooks(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book1);
        victim.add(book2);
        victim.add(book4);
        victim.markBookIsRead(book4);
        victim.markBookIsRead(book1);
        victim.markBookIsRead(book2);

        List<Book> testList = victim.readBookList();

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book4);
        expectedList.add(book1);
        expectedList.add(book2);
        boolean actualResult = checkCollectionEquals(testList, expectedList);
        check(true, actualResult, "All read books");
    }

    void shouldFindUnreadBooks(){
        BookReaderImpl victim = new BookReaderImpl(new ArrayList<>());
        victim.add(book1);
        victim.add(book2);
        victim.add(book4);
        victim.markBookIsNotRead(book4);
        victim.markBookIsNotRead(book1);

        List<Book> testList = victim.unreadBookList();

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book4);
        expectedList.add(book1);
        boolean actualResult = checkCollectionEquals(testList, expectedList);
        check(true, actualResult, "All unread books");
    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public boolean checkCollectionEquals(List colOne, List colTwo) {
        return colOne.containsAll(colTwo);
    }
}
