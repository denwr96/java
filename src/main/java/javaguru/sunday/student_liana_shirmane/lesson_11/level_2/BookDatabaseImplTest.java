package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_2;
//task6
//task7
//task8
//task9
//task10
//task11
//task12
//task13
//task14

import java.util.ArrayList;
import java.util.List;


public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest bookDatabaseImplTest = new BookDatabaseImplTest();

        bookDatabaseImplTest.shouldSaveBook();
        bookDatabaseImplTest.shouldDeleteBookById();
        bookDatabaseImplTest.shouldDeleteBook();
        bookDatabaseImplTest.shouldFindById();
        bookDatabaseImplTest.shouldFindByAuthor();
        bookDatabaseImplTest.shouldFindByTitle();
        bookDatabaseImplTest.shouldCountAllBooks();
        bookDatabaseImplTest.shouldRemoveByAuthor();
        bookDatabaseImplTest.shouldRemoveByTitle();

    }

    Book book1 = new Book("Leo Tolstoy", "War and Peace");
    Book book2 = new Book("Aleksandr Pushkin", "Evgeniy Onegin" );
    Book book3 = new Book("Author", "Some title");
    Book book4 = new Book("Aleksandr Pushkin", "Pikovaya dama");
    Book book5 = new Book("Some Author", "War and Peace" );
    Book book6 = new Book("Some Author","Title");

    void shouldSaveBook() {
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());

        Long actualResult = victim.save(book1);
        Long expectedResult = 1L;
        check(expectedResult, actualResult, "Save the book to the list");

    }

    void shouldDeleteBookById() {
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);

        boolean actualResult = victim.delete(2L);
        check(true, actualResult, "Delete book by Id from database");
    }

    void shouldDeleteBook() {
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);

        boolean actualResult = victim.delete(book1);
        check(true, actualResult, "Delete book from database");
    }

    void shouldFindById() {
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        if (victim.findById(2L).get().equals(book2)) {
            System.out.println("Find book by ID in the list has passed!");
        } else System.out.println("Find book by ID in the list has failed!");
    }

    void shouldFindByAuthor() {
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book4);
        victim.save(book1);

        List<Book> testList = victim.findByAuthor("Aleksandr Pushkin");

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book4);
        expectedList.add(book2);
        boolean actualResult = checkCollectionEquals(testList, expectedList);
        check(true, actualResult, "Find book by author");
    }

    void shouldFindByTitle(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book5);
        victim.save(book2);

        List<Book> testList = victim.findByTitle("War and Peace");

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book5);
        expectedList.add(book1);
        boolean actualResult = checkCollectionEquals(testList, expectedList);
        check(true, actualResult, "Find book by title");
    }

    void shouldCountAllBooks(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book5);
        victim.save(book2);
        victim.save(book6);

        int expectedResult = victim.countAllBooks();
        int actualResult = 4;
        check(actualResult, expectedResult, "Count all books");
    }

    void shouldRemoveByAuthor(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book4);
        victim.save(book1);

        victim.deleteByAuthor("Aleksandr Pushkin");

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book1);
        boolean actualResult = checkCollectionEquals(victim.bookDatabase, expectedList);
        check(true, actualResult, "Remove book by author");
    }

    void shouldRemoveByTitle(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book4);
        victim.save(book1);
        victim.save(book5);

        victim.deleteByTitle("War and Peace");

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book2);
        expectedList.add(book4);
        boolean actualResult = checkCollectionEquals(victim.bookDatabase, expectedList);
        check(true, actualResult, "Remove book by title");
    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public void check(Long expectedResult, Long actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public boolean checkCollectionEquals(List colOne, List colTwo) {
        return colOne.containsAll(colTwo);
    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}