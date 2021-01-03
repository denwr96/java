package javaguru.sunday.student_artjom_proshkin.lesson_10.level_6_middle;

import java.util.ArrayList;
import java.util.List;

class BookReaderImplTest {

    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.addBookTest();
        test.addSameBookTest();
        test.addDifferentBookTest();
        test.checkBookAuthorAndTitleTest();
        test.deleteBookTest();
        test.showSavedBooksTest();
        test.findBookByAuthorTest();
        test.findBookByAuthorPartTest();
        test.findBookByTitleTest();
        test.findBookByTitlePartTest();
        test.bookIsReadTest();
        test.bookIsNotReadTest();
        test.showAllReadBooksTest();
        test.showAllUnreadBooksTest();

    }

    void addBookTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Robert Martin", "Clean Code");
        boolean testResult = victim.addBook(testBook);
        checkResult(testResult, "addBookTest");
    }

    void addSameBookTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Robert Martin", "Clean Code");

        victim.addBook(testBook);
        boolean testResult = victim.addBook(testBook);

        checkResult(!testResult, "addSameBookTest");
    }

    void addDifferentBookTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Robert Martin", "Clean Code");
        Book testBook2 = new Book("Brad Stone", "The Everything Store");

        victim.addBook(testBook);
        boolean testResult = victim.addBook(testBook2);

        checkResult(testResult, "addDifferentBookTest");
    }

    void checkBookAuthorAndTitleTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("", "Clean Code");
        Book testBook2 = new Book("Robert Martin", "");

        boolean testResult = victim.checkBookAuthorAndTitle(testBook);
        boolean testResult2 = victim.checkBookAuthorAndTitle(testBook2);

        checkResult(!testResult, "checkBookAuthorTest");
        checkResult(!testResult2, "checkBookTitleTest");
    }

    void deleteBookTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Robert Martin", "Clean Code");
        Book testBook2 = new Book("Brad Stone", "The Everything Store");

        victim.addBook(testBook);
        victim.addBook(testBook2);

        boolean testDelete = victim.deleteBook(testBook);
        checkResult(testDelete, "deleteBookTest");
    }

    void showSavedBooksTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Robert Martin", "Clean Code");
        Book testBook2 = new Book("Brad Stone", "The Everything Store");

        victim.addBook(testBook);
        victim.addBook(testBook2);

        List<String> expected = new ArrayList<>();
        expected.add("Clean Code [Robert Martin]");
        expected.add("The Everything Store [Brad Stone]");

        List<String> actual = victim.showSavedBooks(victim.bookLibrary);
        checkResult(expected, actual, "showSavedBooksTest");
    }

    void findBookByAuthorTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Robert Martin", "Clean Code");
        Book testBook2 = new Book("Brad Stone", "The Everything Store");
        Book testBook3 = new Book("Robert Martin", "Clean Architecture");

        victim.addBook(testBook);
        victim.addBook(testBook2);
        victim.addBook(testBook3);

        List<Book> actual = victim.findBookByAuthor("Robert Martin");
        System.out.println("Find books by author [Robert Martin] : " + victim.showSavedBooks(actual));
    }

    void findBookByAuthorPartTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Robert Martin", "Clean Code");
        Book testBook2 = new Book("Theodore Dreiser", "The Titan");
        Book testBook3 = new Book("Theodore Dreiser", "The Financier");

        victim.addBook(testBook);
        victim.addBook(testBook2);
        victim.addBook(testBook3);

        List<Book> actual = victim.findBookByAuthorPart("Dreis");
        System.out.println("Find books by author part [Dreis] : " + victim.showSavedBooks(actual));
    }

    void findBookByTitleTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Robert Martin", "Clean Code");
        Book testBook2 = new Book("Theodore Dreiser", "The Titan");
        Book testBook3 = new Book("Robert Martin", "Clean Architecture");
        Book testBook4 = new Book("Theodore Dreiser", "The Financier");
        Book testBook5 = new Book("Brad Stone", "The Everything Store");

        victim.addBook(testBook);
        victim.addBook(testBook2);
        victim.addBook(testBook3);
        victim.addBook(testBook4);
        victim.addBook(testBook5);

        List<Book> actual = victim.findBookByTitle("The Everything Store");
        System.out.println("Find books by title [The Everything Store] : " + victim.showSavedBooks(actual));
    }

    void findBookByTitlePartTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Robert Martin", "Clean Code");
        Book testBook2 = new Book("Theodore Dreiser", "The Titan");
        Book testBook3 = new Book("Robert Martin", "Clean Architecture");
        Book testBook4 = new Book("Theodore Dreiser", "The Financier");
        Book testBook5 = new Book("Robert Martin", "Clean Agile");
        Book testBook6 = new Book("Brad Stone", "The Everything Store");

        victim.addBook(testBook);
        victim.addBook(testBook2);
        victim.addBook(testBook3);
        victim.addBook(testBook4);
        victim.addBook(testBook5);
        victim.addBook(testBook6);

        List<Book> actual = victim.findBookByTitlePart("Clean");
        List<Book> actual2 = victim.findBookByTitlePart("The");
        System.out.println("Find books by title part [Clean] : " + victim.showSavedBooks(actual));
        System.out.println("Find books by title part [The] : " + victim.showSavedBooks(actual2));
    }

    void bookIsReadTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Theodore Dreiser", "The Financier");
        victim.addBook(testBook);
        victim.bookWasRead(testBook);
        checkResult(testBook.isAlreadyRead(), "bookIsReadTest");
    }

    void bookIsNotReadTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Theodore Dreiser", "The Stoic");
        victim.addBook(testBook);
        victim.bookWasRead(testBook);
        victim.bookWasNotRead(testBook);
        checkResult(!testBook.isAlreadyRead(), "bookIsNotReadTest");
    }

    void showAllReadBooksTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Robert Martin", "Clean Code");
        Book testBook2 = new Book("Theodore Dreiser", "The Titan");
        Book testBook3 = new Book("Robert Martin", "Clean Architecture");
        victim.addBook(testBook);
        victim.addBook(testBook2); // unread
        victim.addBook(testBook3);
        victim.bookWasRead(testBook);
        victim.bookWasRead(testBook3);

        List<String> actual = victim.showAllReadBooks(victim.bookLibrary);
        System.out.println("Read books : " + actual);
    }

    void showAllUnreadBooksTest() {
        BookReaderImpl victim = new BookReaderImpl();
        Book testBook = new Book("Robert Martin", "Clean Architecture");
        Book testBook2 = new Book("Theodore Dreiser", "The Financier");
        Book testBook3 = new Book("Robert Martin", "Clean Agile");
        Book testBook4 = new Book("Brad Stone", "The Everything Store");
        victim.addBook(testBook);
        victim.addBook(testBook2); // unread
        victim.addBook(testBook3);
        victim.addBook(testBook4);// unread
        victim.bookWasRead(testBook);
        victim.bookWasRead(testBook3);

        List<String> actual = victim.showAllUnreadBooks(victim.bookLibrary);
        System.out.println("Unread books : " + actual);
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED!");
        }
    }

    public void checkResult(List<String> expected, List<String> actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}