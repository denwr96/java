package main.java.javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_6_middle;

import java.util.Arrays;

// task14, task15, task16, task17, task18, task19, task20, task21, task22, task23, task24, task25;

public class BookReaderTest {
    private BookReaderImpl victim = new BookReaderImpl();

    public static void main(String[] args) {
        BookReaderTest bookReaderTest = new BookReaderTest();
//        bookReaderTest.bookAddTest();
//        bookReaderTest.bookAddV2Test();
//        bookReaderTest.deleteBookTest();
//        bookReaderTest.showBooksTest();
//        bookReaderTest.searchByAuthorTest();
//        bookReaderTest.searchByAuthorBeginningTest();
//        bookReaderTest.isReadBookTest();
//        bookReaderTest.isNotReadBookTest();
//        bookReaderTest.searchByTitleTest();
//        bookReaderTest.searchByTitleBeginningTest();
//        bookReaderTest.isReadBookTest();
//        bookReaderTest.isNotReadBookTest();
//        bookReaderTest.getRedBookList();
//        bookReaderTest.getNotRedBookList();
    }

    public void bookAddTest() {
        Book bookOne = new Book("Principles", "Alex Pushkin");
        Book bookTwo = new Book("Principles", "Lev Tolstoy");
        Book bookThree = new Book("War and Peace", "Alex Pushkin");
        Book bookFour = new Book("Principles", "Alex Pushkin");
        checkResults(victim.addBook(bookOne) == true, "bookAddTestMustBeOK");
        checkResults(victim.addBook(bookOne) == true, "bookAddTestMustBeFAIL");
        checkResults(victim.addBook(bookTwo) == true, "bookAddTestMustBeOK");
        checkResults(victim.addBook(bookTwo) == true, "bookAddTestMustBeFAIL");
        checkResults(victim.addBook(bookThree) == true, "bookAddTestMustBeOK");
        checkResults(victim.addBook(bookThree) == true, "bookAddTestMustBeFAIL");
        checkResults(victim.addBook(bookFour) == true, "bookAddTestMustBeFAIL");
    }

    public void bookAddV2Test() {
        Book bookOne = new Book("Eugene Onegin", "Alex Pushkin");
        Book bookTwo = new Book("Eugene Onegin", "");
        Book bookThree = new Book("", "Alex Pushkin");
        Book bookFour = new Book("", "");
        checkResults(victim.addBookV2(bookOne) == true, "bookAddV2TestMustBeOK");
        checkResults(victim.addBookV2(bookTwo) == true, "bookAddV2TestMustBeFAIL");
        checkResults(victim.addBookV2(bookThree) == true, "bookAddV2TestMustBeFAIL");
        checkResults(victim.addBookV2(bookFour) == true, "bookAddV2TestMustBeFAIL");
    }

    public void deleteBookTest() {
        Book bookOne = new Book("Eugene Onegin", "Alex Pushkin");
        victim.addBook(bookOne);
        checkResults(victim.deleteBook(bookOne) == true, "bookAddV2TestMustBeOK");
        checkResults(victim.deleteBook(bookOne) == true, "bookAddV2TestMustBeFAIL");
    }

    public void showBooksTest() {
        victim.addBook(new Book("Eugene Onegin", "Alex Pushkin"));
        victim.addBook(new Book("Dubrovsky", "Alex Pushkin"));
        String[] expectedArray = {"Eugene Onegin [Alex Pushkin]", "Dubrovsky [Alex Pushkin]"};
        var result = victim.getBooks();
        checkResults(result.equals(Arrays.asList(expectedArray)), "showBooksTest");
    }

    public void searchByAuthorTest() {
        victim.addBook(new Book("Eugene Onegin", "Alex Pushkin"));
        victim.addBook(new Book("Dubrovsky", "Alex Pushkin"));
        var result = victim.searchByAuthor("Alex Pushkin");
        checkResults(result.size() == 2, "searchByAuthorTestMustBeOk");
        checkResults(result.size() == 0, "searchByAuthorTestMustBeFail");
    }

    public void searchByAuthorBeginningTest() {
        victim.addBook(new Book("Eugene Onegin", "Alex Pushkin"));
        victim.addBook(new Book("Dubrovsky", "Alex Pushkin"));
        victim.addBook(new Book("The Queen of Spades", "Alex Pushkin"));
        var result = victim.findByAuthorBeginning("Alex");
        checkResults(result.size() == 3, "searchByAuthorBeginningTestMustBeOk");
        checkResults(result.size() == 0, "searchByAuthorBeginningTestMustBeFail");
    }

    public void searchByTitleTest() {
        victim.addBook(new Book("The Captain’s Daughter", "Alex Pushkin"));
        victim.addBook(new Book("The Belkin Tales", "Alex Pushkin"));
        var result = victim.searchByTitle("The Captain’s Daughter");
        checkResults(result.size() == 1, "searchByTitleTestMustBeOk");
        checkResults(result.size() == 0, "searchByTitleTestMustBeFail");
    }

    public void searchByTitleBeginningTest() {
        victim.addBook(new Book("The Captain’s Daughter", "Alex Pushkin"));
        victim.addBook(new Book("The Belkin Tales", "Alex Pushkin"));
        var result = victim.searchByTitleBeginning("The");
        checkResults(result.size() == 2, "searchByTitleBeginningTestMustBeOk");
        checkResults(result.size() == 0, "searchByTitleBeginningTestMustBeFail");
    }

    public void isReadBookTest() {
        Book bookOne = new Book("Eugene Onegin", "Alex Pushkin");
        Book bookTwo = new Book("Principles", "Lev Tolstoy");
        victim.addBook(bookOne);
        checkResults(victim.setBookAsRed(bookOne) == true, "isReadBookTestMustBeOk");
        checkResults(victim.setBookAsRed(bookTwo) == true, "isReadBookTestMustBeFail");
    }

    public void isNotReadBookTest() {
        Book bookOne = new Book("Eugene Onegin", "Alex Pushkin");
        Book bookTwo = new Book("Principles", "Lev Tolstoy");
        victim.addBook(bookOne);
        checkResults(victim.setBookAsNotRed(bookOne) == true, "isNotReadBookTestMustBeOk");
        checkResults(victim.setBookAsNotRed(bookTwo) == false, "isNotReadBookTestMustBeOk");
    }

    public void getRedBookList() {
        Book bookOne = new Book("Eugene Onegin", "Alex Pushkin");
        Book bookTwo = new Book("Principles", "Lev Tolstoy");
        victim.addBook(bookOne);
        victim.addBook(bookTwo);
        victim.setBookAsRed(bookOne);
        victim.setBookAsRed(bookTwo);
        var result = victim.getRedBookList();
        checkResults(result.size() == 2, "getRedBookListMustBeOk");
        checkResults(result.size() == 0, "getRedBookListMustBeFail");
    }

    public void getNotRedBookList() {
        Book bookOne = new Book("Eugene Onegin", "Alex Pushkin");
        Book bookTwo = new Book("Principles", "Lev Tolstoy");
        victim.addBook(bookOne);
        victim.addBook(bookTwo);
        victim.setBookAsNotRed(bookOne);
        victim.setBookAsRed(bookTwo);
        var result = victim.getNotRedBookList();
        checkResults(result.size() == 1, "getRedBookListMustBeOk");
        checkResults(result.size() == 0, "getRedBookListMustBeFail");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }

}
