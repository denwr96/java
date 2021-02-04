package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_6;

// Task 14 - 25

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
class BookTest {

    public static void main(String[] args) {
        BookTest bookTest = new BookTest();
        bookTest.addBookTests();
        bookTest.removeBookTest();
        bookTest.printBooksListTest();
        bookTest.findBookTest();
        bookTest.findBookByAuthorTest();
        bookTest.findBookByAuthorStartsWithWordSearchTest();
        bookTest.findBookByTitleTest();
        bookTest.findBookByTitleStartsWithWordSearchTest();
        bookTest.bookIsAlreadyReadTest();
        bookTest.bookIsUnreadTest();
        bookTest.printReadBookListTest();
        bookTest.printUnreadBookListTest();
    }

    void addBookTests() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");
        Book bookWithoutAuthor = new Book("Созерцатель тени", "");
        Book bookWithoutTitleAndAuthor = new Book("", "");

        System.out.println("---- Add book tests ----");

        checkResults(bookReader.addBook(book1), "Add book test");
        checkResults(!bookReader.addBook(book1), "Don't add same book test");
        checkResults(!bookReader.addBook(bookWithoutAuthor), "Don't add book without author test");
        checkResults(!bookReader.addBook(bookWithoutTitleAndAuthor), "Don't add book without author / title test");
    }

    void removeBookTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");
        Book book2 = new Book("Над пропастью во ржи", "Джером Сэлинджер");

        bookReader.addBook(book1);
        bookReader.addBook(book2);

        System.out.println("\n---- Remove book test ----");
        checkResults(bookReader.removeBook(new Book("По кочкам и ухабам", "Дэвид Барр Кетли")), "Book removal test");
    }

    void printBooksListTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");
        Book book2 = new Book("Над пропастью во ржи", "Джером Сэлинджер");

        bookReader.addBook(book1);
        bookReader.addBook(book2);

        System.out.println("\n---- Print books list test ----");
        bookReader.printBookList();
    }

    void findBookTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");
        Book book2 = new Book("Над пропастью во ржи", "Джером Сэлинджер");

        bookReader.addBook(book1);
        bookReader.addBook(book2);

        System.out.println("\n---- Find book test ----");
        System.out.println("Current list of books: ");
        bookReader.printBookList();
        checkResults(bookReader.findBook(book1).equals(book1), "Find book test");
    }

    void findBookByAuthorTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");
        Book book2 = new Book("Над пропастью во ржи", "Джером Сэлинджер");

        bookReader.addBook(book1);
        bookReader.addBook(book2);

        System.out.println("\n---- Find book by author test ----");

        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("По кочкам и ухабам", "Дэвид Барр Кетли"));

        checkResults(bookReader.findBookByAuthor("Дэвид Барр Кетли").containsAll(expectedResult), "Find book by author test");
    }

    void findBookByAuthorStartsWithWordSearchTest() {
        BookReader bookReader = new BookReaderImpl();

        bookReader.addBook(new Book("По кочкам и ухабам", "Дэвид Барр Кетли"));
        bookReader.addBook(new Book("Над пропастью во ржи", "Джером Сэлинджер"));
        bookReader.addBook(new Book("Остров", "Олдос Хаксли"));
        bookReader.addBook(new Book("Остров сокровищ", "Роберт Льюис Стивенсон"));

        System.out.println("\n---- Find book by author test (starts with word search) ----");
        List<Book> expectedResultList = new ArrayList<>();
        expectedResultList.add(new Book("По кочкам и ухабам", "Дэвид Барр Кетли"));

        checkResults(bookReader.findBookByAuthorStartsWithWordSearch("Дэвид").containsAll(expectedResultList), "Find book by author (starts with words search) test");
    }

    void findBookByTitleTest() {
        BookReader bookReader = new BookReaderImpl();

        bookReader.addBook(new Book("По кочкам и ухабам", "Дэвид Барр Кетли"));
        bookReader.addBook(new Book("Над пропастью во ржи", "Джером Сэлинджер"));
        bookReader.addBook(new Book("Остров", "Олдос Хаксли"));
        bookReader.addBook(new Book("Остров сокровищ", "Роберт Льюис Стивенсон"));

        System.out.println("\n---- Find book by title test ----");

        List<Book> expectedResultList = new ArrayList<>();
        expectedResultList.add(new Book("Над пропастью во ржи", "Джером Сэлинджер"));

        checkResults(bookReader.findBookByTitle("Над пропастью во ржи").containsAll(expectedResultList), "Find book by title test");
    }

    void findBookByTitleStartsWithWordSearchTest() {
        BookReader bookReader = new BookReaderImpl();

        bookReader.addBook(new Book("По кочкам и ухабам", "Дэвид Барр Кетли"));
        bookReader.addBook(new Book("Над пропастью во ржи", "Джером Сэлинджер"));
        bookReader.addBook(new Book("Остров", "Олдос Хаксли"));
        bookReader.addBook(new Book("Остров сокровищ", "Роберт Льюис Стивенсон"));

        System.out.println("\n---- Find book by title test (partial words search) ----");

        List<Book> expectedResultList = new ArrayList<>();
        expectedResultList.add(new Book("Остров", "Олдос Хаксли"));
        expectedResultList.add(new Book("Остров сокровищ", "Роберт Льюис Стивенсон"));

        checkResults(bookReader.findBookByTitleStartsWithWordSearch("Остров").containsAll(expectedResultList), "Find book by title test");
    }

    void bookIsAlreadyReadTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");

        bookReader.addBook(book1);

        System.out.println("\n---- Set book is read tests ----");
        checkResults(bookReader.bookIsAlreadyRead(book1), "Set book is read test");
    }

    void bookIsUnreadTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");

        bookReader.addBook(book1);

        System.out.println("\n---- Set book is unread test ----");
        checkResults(bookReader.bookIsUnread(book1), "Set book is unread test");
    }

    void printReadBookListTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");
        Book book2 = new Book("Над пропастью во ржи", "Джером Сэлинджер");

        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.bookIsAlreadyRead(book1);

        System.out.println("\n---- Print read books list test ----");
        bookReader.printReadBookList();
    }

    void printUnreadBookListTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("По кочкам и ухабам", "Дэвид Барр Кетли");
        Book book2 = new Book("Над пропастью во ржи", "Джером Сэлинджер");

        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.bookIsAlreadyRead(book1);
        bookReader.bookIsUnread(book1);

        System.out.println("\n---- Print unread books list test ----");
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
