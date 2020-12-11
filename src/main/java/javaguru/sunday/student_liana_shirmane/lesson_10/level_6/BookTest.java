package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_6;
//task14
//task15
//task16
//task17

public class BookTest {
    public static void main(String[] args) {
        BookTest bookTest = new BookTest();
        bookTest.shouldAddNewBook();
        bookTest.shouldNotAddExistingBook();
        bookTest.shouldNotAddBookWithoutAuthor();
        bookTest.shouldRemoveBook();
        bookTest.shouldNotRemoveBook();
        bookTest.printBookList();
    }

    BookReader bookReader = new BookReaderImpl();
    Book book1 = new Book("War and Peace", "Leo Tolstoy");
    Book book2 = new Book("Evgeniy Onegin", "Aleksandr Pushkin");
    Book book3 = new Book("Some title", "");


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
        boolean actualResult = bookReader.remove(book2);
        check(false, actualResult, "Remove not existing book in the list");
    }
    void printBookList(){
        bookReader.printBookList();
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
