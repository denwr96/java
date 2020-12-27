package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_6;

// Task 14 - 25

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class BookTest {

    public static void main(String[] args) {
        BookTest bookTest = new BookTest();
        bookTest.addBookTests();
        bookTest.removeBookTest();
        bookTest.printBooksListTest();
        bookTest.findBookTest();
        bookTest.findBookByAuthorTest();
        bookTest.findBookByAuthorPartialWordSearchTest();
        bookTest.findBookByTitleTest();
        bookTest.findBookByTitlePartialSearchTest();
        bookTest.bookIsAlreadyReadTest();
        bookTest.bookIsUnreadTest();
        bookTest.printReadBookListTest();
        bookTest.printUnreadBookListTest();
    }

    BookReader bookReader = new BookReaderImpl();
    Book book1 = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");
    Book book2 = new Book("Над пропастью во ржи", "Джером Сэлинджер");
    Book book3 = new Book("Остров", "Олдос Хаксли");
    Book book4 = new Book("Остров сокровищ", "Роберт Льюис Стивенсон");
//    Book bookWithoutAuthor = new Book("Созерцатель тени");
//    Book bookWithoutTitleAndAuthor = new Book();

    void addBookTests() {
        System.out.println("---- Add book tests ----");
        checkResults(bookReader.addBook(book1), "Add book test");
        checkResults(!bookReader.addBook(book1), "Don't add same book test");
//        checkResults(!bookReader.addBook(bookWithoutAuthor), "Don't add book without author test");
//        checkResults(!bookReader.addBook(bookWithoutTitleAndAuthor), "Don't add book without author / title test");
    }

    void removeBookTest() {
        System.out.println("\n---- Remove book test ----");
        bookReader.addBook(book2);
        System.out.println("Library before removal: ");
        bookReader.printBookList();
        checkResults(bookReader.removeBook(book1), "Book removal test");
        System.out.println("Library after removal: ");
        bookReader.printBookList();
    }

    void printBooksListTest() {
        System.out.println("\n---- Print books list test ----");
        System.out.println("list of books before add: ");
        bookReader.printBookList();
        bookReader.addBook(book1);
        System.out.println("list of books after add: ");
        bookReader.printBookList();
    }

    void findBookTest() {
        System.out.println("\n---- Find book test ----");
        System.out.println("Current list of books: ");
        bookReader.printBookList();
        checkResults(bookReader.findBook(book1).equals(book1), "Find book test");
    }

    void findBookByAuthorTest() {
        System.out.println("\n---- Find book by author test ----");
        System.out.println("Current list of books: ");
        bookReader.printBookList();
        Book[] expectedResultArray = new Book[6];
        expectedResultArray[0] = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");

        checkResults(Arrays.equals(bookReader.findBookByAuthor("Дэвид Барр Кетли"),expectedResultArray), "Find book by author test");
    }

    void findBookByAuthorPartialWordSearchTest() {
        System.out.println("\n---- Find book by author test (partial words search) ----");
        System.out.println("Current list of books: ");
        bookReader.printBookList();
        Book[] expectedResultArray = new Book[6];
        expectedResultArray[0] = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");

        checkResults(Arrays.equals(bookReader.findBookByAuthorPartialWordSearch("Дэвид"),expectedResultArray), "Find book by author (partial words search) test");
    }

    void findBookByTitleTest() {
        System.out.println("\n---- Find book by title test ----");
        bookReader.addBook(book3);
        bookReader.addBook(book4);
        Book[] expectedResultArray = new Book[6];
        expectedResultArray[1] = new Book("Над пропастью во ржи", "Джером Сэлинджер");

        checkResults(Arrays.equals(bookReader.findBookByTitle("Над пропастью во ржи"),expectedResultArray), "Find book by title test");
    }

    void findBookByTitlePartialSearchTest() {
        System.out.println("\n---- Find book by title test (partial words search) ----");
        Book[] expectedResultArray = new Book[6];
        expectedResultArray[2] = new Book("Остров", "Олдос Хаксли");
        expectedResultArray[3] = new Book("Остров сокровищ", "Роберт Льюис Стивенсон");

        checkResults(Arrays.equals(bookReader.findBookByTitlePartialSearch("Остров"),expectedResultArray), "Find book by title test");
    }

    void bookIsAlreadyReadTest() {
        System.out.println("\n---- Set book is read test ----");
        checkResults(bookReader.bookIsAlreadyRead(book1), "Set book is read test");
    }

    void bookIsUnreadTest() {
        System.out.println("\n---- Set book is unread test ----");
        checkResults(bookReader.bookIsUnread(book1), "Set book is unread test");
    }

    void printReadBookListTest() {
        System.out.println("\n---- Print read books list test ----");
        bookReader.bookIsAlreadyRead(book1);
        bookReader.printReadBookList();
    }

    void printUnreadBookListTest() {
        System.out.println("\n---- Print unread books list test ----");
        System.out.println("All books list: ");
        bookReader.printBookList();
        bookReader.printUnreadBookList();
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
