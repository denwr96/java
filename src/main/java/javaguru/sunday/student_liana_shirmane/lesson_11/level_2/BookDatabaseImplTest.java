package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_2;
//task6

import java.util.ArrayList;


public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest bookDatabaseImplTest = new BookDatabaseImplTest();

        bookDatabaseImplTest.shouldSaveBook();
        bookDatabaseImplTest.shouldDeleteBook();

    }

    Book book1 = new Book("War and Peace", "Leo Tolstoy");
    Book book2 = new Book("Evgeniy Onegin", "Aleksandr Pushkin");
    Book book3 = new Book("Some title", "Author");
    Book book4 = new Book("Pikovaya dama", "Aleksandr Pushkin");
    Book book5 = new Book("War and Peace", "Some Author");
    Book book6 = new Book("Title", "Some Author");

    void shouldSaveBook() {
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());

        Long actualResult = victim.save(book1);
        Long expectedResult = 1L;
        check(expectedResult, actualResult, "Save the book to the list");

    }

    void shouldDeleteBook(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
 victim.printBookList();
        boolean actualResult = victim.delete(2L);
        check(true, actualResult, "Delete book from database");

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
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}