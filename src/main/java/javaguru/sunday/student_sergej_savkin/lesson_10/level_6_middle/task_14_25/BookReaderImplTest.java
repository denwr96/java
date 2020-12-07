package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_6_middle.task_14_25;

//task14to25

import java.util.Arrays;

class BookReaderImplTest {

    public static void main(String[] args) {
        BookReaderImplTest bookReaderImplTest = new BookReaderImplTest();
        bookReaderImplTest.addBookTest();
        bookReaderImplTest.checkIfBookHasTitleAndAuthorTest();
        bookReaderImplTest.deleteBookTest();
        bookReaderImplTest.showBookListTest();
        bookReaderImplTest.findByAuthorTest();
        bookReaderImplTest.findByAuthorBeginningTest();
        bookReaderImplTest.findByTitleTest();
        bookReaderImplTest.findByTitleBeginningTest();
        bookReaderImplTest.setBookAsRedTest();
        bookReaderImplTest.setBookAsNotRedTest();
        bookReaderImplTest.getRedBookListTest();
        bookReaderImplTest.getNotRedBookListTest();
    }

    BookReaderImpl bookReader = new BookReaderImpl();

    public void addBookTest() {
        check(bookReader.addBook(new Book("Harry Potter", "Johan Rolling")), "addBookTest");
        check(!bookReader.addBook(new Book("Harry Potter", "Johan Rolling")), "addBookTestTwo");
    }

    public void checkIfBookHasTitleAndAuthorTest() {
        check(bookReader.addBook(new Book("War and Peace", "Tolstoj")),"checkIfBookHasTitleAndAuthorTest");
        check(!bookReader.addBook(new Book("", "")), "checkIfBookHasTitleAndAuthorFailTest");
    }

    public void deleteBookTest() {
        check(bookReader.deleteBook(new Book("War and Peace", "Tolstoj")), "deleteBookTest");
        check(!bookReader.deleteBook(new Book("War and Peace", "Tolstoj")), "deleteBookFailTest");
    }

    public void showBookListTest() {
        String[] expectedArray = {"Harry Potter [Johan Rolling]"};
        check(expectedArray, bookReader.showBookList(bookReader.bookArray), "showBookListTest");
    }

    public void findByAuthorTest(){
        for (int i = 0; i < bookReader.searchByAuthor("Johan Rolling").length; i++) {
            System.out.println("Found by author Johan Rolling: " + bookReader.searchByAuthor("Johan Rolling")[i].toString());
        }
    }

    public void findByAuthorBeginningTest(){
        for (int i = 0; i < bookReader.searchByAuthorBeginning("Joh").length; i++) {
            System.out.println("Found by author beginning Joh: " + bookReader.searchByAuthorBeginning("Joh")[i].toString());
        }
    }

    public void findByTitleTest(){
        for (int i = 0; i < bookReader.searchByTitle("Harry Potter").length; i++) {
            System.out.println("Found by title Harry Potter: " + bookReader.searchByTitle("Harry Potter")[i].toString());
        }
    }

    public void findByTitleBeginningTest(){
        for (int i = 0; i < bookReader.searchByTitleBeginning("Harry").length; i++) {
            System.out.println("Found by title beginning Harry: " + bookReader.searchByTitleBeginning("Harry")[i].toString());
        }
    }

    public void setBookAsRedTest(){
        check(bookReader.setBookAsRed(new Book("Harry Potter", "Johan Rolling")), "setBookAsRedTest");
        check(!bookReader.setBookAsRed(new Book("War and Peace", "Tolstoj")), "setBookAsRedTestTwo");
    }

    public void setBookAsNotRedTest(){
        check(bookReader.setBookAsNotRed(new Book("Harry Potter", "Johan Rolling")), "setBookAsNotRedTest");
        check(!bookReader.setBookAsNotRed(new Book("War and Peace", "Tolstoj")), "setBookAsNotRedTestTwo");
    }

    public void getRedBookListTest(){
        bookReader.setBookAsRed(new Book("Harry Potter", "Johan Rolling"));
        String[] expectedArray = {"Harry Potter [Johan Rolling]"};
        check(expectedArray, bookReader.getRedBookList(bookReader.bookArray), "getRedBookListTest");
    }

    public void getNotRedBookListTest(){
        bookReader.addBook(new Book("War and Peace", "Tolstoj"));
        String[] expectedArray = {"War and Peace [Tolstoj]"};
        check(expectedArray, bookReader.getNotRedBookList(bookReader.bookArray), "getNotRedBookListTest");
    }

    public void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(String[] expectedArray, String[] actualArray, String testName) {
        if(Arrays.deepEquals(expectedArray, actualArray)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
