package javaguru.sunday.student_sergej_savkin.lesson_10.level_6_middle.task_14_25;

//task14to25

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CodeReview(approved = true)
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



    public void addBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        check(bookReader.addBook(new Book("Harry Potter", "Johan Rolling")), "addBookTest");
        check(!bookReader.addBook(new Book("Harry Potter", "Johan Rolling")), "addBookTestTwo");
    }

    public void checkIfBookHasTitleAndAuthorTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        check(bookReader.addBook(new Book("War and Peace", "Tolstoj")),"checkIfBookHasTitleAndAuthorTest");
        check(!bookReader.addBook(new Book("", "")), "checkIfBookHasTitleAndAuthorFailTest");
    }

    public void deleteBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("War and Peace", "Tolstoj"));
        check(bookReader.deleteBook(new Book("War and Peace", "Tolstoj")), "deleteBookTest");
        check(!bookReader.deleteBook(new Book("War and Peace", "Tolstoj")), "deleteBookFailTest");
    }

    public void showBookListTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "Johan Rolling"));
        List<String> expectedArray = new ArrayList<>();
        expectedArray.add("Harry Potter [Johan Rolling]");
        check(expectedArray, bookReader.showBookList(bookReader.bookArray), "showBookListTest");
    }

    public void findByAuthorTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        for (int i = 0; i < bookReader.searchByAuthor("Johan Rolling").size(); i++) {
            System.out.println("Found by author Johan Rolling: " + bookReader.searchByAuthor("Johan Rolling").get(i).toString());
        }
    }

    public void findByAuthorBeginningTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        for (int i = 0; i < bookReader.searchByAuthorBeginning("Joh").size(); i++) {
            System.out.println("Found by author beginning Joh: " + bookReader.searchByAuthorBeginning("Joh").get(i).toString());
        }
    }

    public void findByTitleTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        for (int i = 0; i < bookReader.searchByTitle("Harry Potter").size(); i++) {
            System.out.println("Found by title Harry Potter: " + bookReader.searchByTitle("Harry Potter").get(i).toString());
        }
    }

    public void findByTitleBeginningTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        for (int i = 0; i < bookReader.searchByTitleBeginning("Harry").size(); i++) {
            System.out.println("Found by title beginning Harry: " + bookReader.searchByTitleBeginning("Harry").get(i).toString());
        }
    }

    public void setBookAsRedTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "Johan Rolling"));
        check(bookReader.setBookAsRed(new Book("Harry Potter", "Johan Rolling")), "setBookAsRedTest");
        check(!bookReader.setBookAsRed(new Book("War and Peace", "Tolstoj")), "setBookAsRedTestTwo");
    }

    public void setBookAsNotRedTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "Johan Rolling"));
        check(bookReader.setBookAsNotRed(new Book("Harry Potter", "Johan Rolling")), "setBookAsNotRedTest");
        check(!bookReader.setBookAsNotRed(new Book("War and Peace", "Tolstoj")), "setBookAsNotRedTestTwo");
    }

    public void getRedBookListTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "Johan Rolling"));
        bookReader.setBookAsRed(new Book("Harry Potter", "Johan Rolling"));
        List<String> expectedArray = new ArrayList<>();
        expectedArray.add("Harry Potter [Johan Rolling]");
        check(expectedArray, bookReader.getRedBookList(bookReader.bookArray), "getRedBookListTest");
    }

    public void getNotRedBookListTest(){
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("War and Peace", "Tolstoj"));
        List<String> expectedArray = new ArrayList<>();
        expectedArray.add("War and Peace [Tolstoj]");
        check(expectedArray, bookReader.getNotRedBookList(bookReader.bookArray), "getNotRedBookListTest");
    }

    public void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(List<String> expectedArray, List<String> actualArray, String testName) {
        if(expectedArray.equals(actualArray)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
