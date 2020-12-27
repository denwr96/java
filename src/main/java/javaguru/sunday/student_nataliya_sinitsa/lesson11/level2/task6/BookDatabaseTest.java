package javaguru.sunday.student_nataliya_sinitsa.lesson11.level2.task6;

//Task 6 --> Task 14

import java.util.ArrayList;
import java.util.List;

class BookDatabaseTest {

    public static void main(String[] args) {

        BookDatabaseTest test = new BookDatabaseTest();

        test.shouldSaveBook();
        test.shouldDeleteBookByIdTrue();
        test.shouldDeleteBookByIdFalse();
        test.shouldDeleteBookByBookTrue();
        test.shouldDeleteBookByBookFalse();
        test.shouldFindByIdBook();
        test.shouldFindByIdNull();
        test.shouldFoundBooksByAuthor();
        test.shouldFoundBooksByTitle();
        test.shouldCountAllBooks();
        test.shouldDeleteBooksByAuthor();
        test.shouldDeleteBooksByTitle();
    }

    Book bookOne = new Book("George Orwell", "1984");
    Book bookTwo = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
    Book bookThree = new Book("Ethel Lilian Voynich", "The Gadfly");
    Book bookFour = new Book("Test", "1984");

    public void shouldSaveBook() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.save(bookOne);
        victim.save(bookTwo);
        check(victim.bookList.get(0).getId().equals(1L) && victim.bookList.get(1).getId().equals(2L),
                "shouldSaveBook");
    }

    public void shouldDeleteBookByIdTrue() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        victim.save(bookOne);
        victim.save(bookTwo);
        check(victim.delete(2L), "shouldDeleteBookByIdTrue");
    }

    public void shouldDeleteBookByIdFalse() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        victim.save(bookOne);
        victim.save(bookTwo);
        check(!victim.delete(3L), "shouldDeleteBookByIdFalse");
    }

    public void shouldDeleteBookByBookTrue() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        victim.save(bookOne);
        victim.save(bookTwo);
        Book bookToDelete = new Book("George Orwell", "1984");
        check(victim.delete(bookToDelete), "shouldDeleteBookByBookTrue");
    }

    public void shouldDeleteBookByBookFalse() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        victim.save(bookOne);
        victim.save(bookTwo);
        Book bookToDelete = bookThree;
        check(!victim.delete(bookToDelete), "shouldDeleteBookByBookFalse");
    }

    public void shouldFindByIdBook() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        victim.save(bookOne);
        victim.save(bookTwo);
        check(victim.findById(1L).get().equals(new Book("George Orwell", "1984")),
                "shouldFindByIdBook");
    }

    public void shouldFindByIdNull() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        victim.save(bookOne);
        victim.save(bookTwo);
        check(victim.findById(3L).isEmpty(), "shouldFindByIdNull");
    }

    public void shouldFoundBooksByAuthor() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        List<Book> actualList = victim.findByAuthor("Ethel Lilian Voynich");
        List<Book> expectedList = new ArrayList<>() {{
            add(bookTwo);
            add(bookThree);
        }};
        check(actualList.equals(expectedList), "shouldFoundBooksByAuthor");
    }

    public void shouldFoundBooksByTitle() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        victim.bookList.add(bookFour);
        List<Book> actualList = victim.findByTitle("1984");
        List<Book> expectedList = new ArrayList<>() {{
            add(bookOne);
            add(bookFour);
        }};
        check(actualList.equals(expectedList), "shouldFoundBooksByTitle");
    }

    public void shouldCountAllBooks() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        victim.bookList.add(bookFour);
        check(victim.countAllBooks() == 4, "shouldCountAllBooks");
    }

    public void shouldDeleteBooksByAuthor() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        victim.bookList.add(bookFour);
        victim.deleteByAuthor("Ethel Lilian Voynich");
        List<Book> actualList = victim.bookList;
                List<Book> expectedList = new ArrayList<>() {{
            add(bookOne);
            add(bookFour);
        }};
        check(actualList.equals(expectedList), "shouldDeleteBooksByAuthor");
    }

    public void shouldDeleteBooksByTitle() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        victim.bookList.add(bookFour);
        victim.deleteByTitle("1984");
        List<Book> actualList = victim.bookList;
        List<Book> expectedList = new ArrayList<>() {{
            add(bookTwo);
            add(bookThree);
        }};
        check(actualList.equals(expectedList), "shouldDeleteBooksByAuthor");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
