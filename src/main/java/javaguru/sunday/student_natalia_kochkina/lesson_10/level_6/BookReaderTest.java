package javaguru.sunday.student_natalia_kochkina.lesson_10.level_6;

//Task_14
//Task_15
//Task_16
//Task_17
//Task_18
//Task_19
//Task_20
//Task_21
//Task_22
//Task_23
//Task_24
//Task_25

import java.util.ArrayList;
import java.util.List;


public class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest bookReaderTest = new BookReaderTest();
        bookReaderTest.shouldAddBookTest1();
        bookReaderTest.shouldAddBookTest2();
        bookReaderTest.shouldAddBookWithoutAuthorTest();
        bookReaderTest.shouldDeleteBookTest();
        bookReaderTest.shouldDeleteBookTest2();
        bookReaderTest.shouldCreateListOfBooksTest();
        bookReaderTest.shouldCreateListOfBooksOfOneAuthorTest();
        bookReaderTest.shouldCreateListOfBooksByPartOfAuthor();
        bookReaderTest.shouldCreateListOfBooksWithSameTitle();
        bookReaderTest.shouldCreateListOfBooksByPartOfTitle();
        bookReaderTest.shouldMakeBookFinishedTest();
        bookReaderTest.shouldMakeBookFinishedTest2();
        bookReaderTest.shouldMakeBookUnreadTest();
        bookReaderTest.shouldCreateListOfFinishedBooksTest();
        bookReaderTest.shouldCreateListOfUnreadBooksTest();
    }

    public void shouldAddBookTest1() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Чапаев и Пустота", "Пелевин");
        boolean bookIsAdd = bookReader.addBook(book);
        if (bookIsAdd) {
            System.out.println("Add Book Test Ok");
        } else {
            System.out.println("Add Book Test Failed");
        }
    }

    public void shouldAddBookTest2() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        boolean bookIsAdd = bookReader.addBook(book3);
        if (bookIsAdd) {
            System.out.println("Add Book Test2 Failed");
        } else {
            System.out.println("Add Book Test2 OK");
        }
    }

    public void shouldAddBookWithoutAuthorTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Конституция РФ", "");
        boolean bookIsAdd = bookReader.addBook(book);
        if (bookIsAdd) {
            System.out.println("Book Without Author Test Failed");
        } else {
            System.out.println("Book Without Author Test OK");
        }
    }

    public void shouldDeleteBookTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        boolean bookIsDelete = bookReader.deleteBook(book2);
        if (!bookIsDelete) {
            System.out.println("Delete Book Test OK");
        } else {
            System.out.println("Delete Book Test Failed");
        }
    }

    public void shouldDeleteBookTest2() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        bookReader.addBook(book2);
        boolean bookIsDelete = bookReader.deleteBook(book1);
        if (bookIsDelete) {
            System.out.println("Delete Book Test OK");
        } else {
            System.out.println("Delete Book Test Failed");
        }
    }

    public void shouldCreateListOfBooksTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        List<String> allBooks = bookReader.booksAuthorAndTitle();
        String titleAndAuthor1 = allBooks.get(0);
        String titleAndAuthor2 = allBooks.get(1);
        String expectedResult2 = "Поваренная книга анархиста [Уильям Пауэлл]";
        String expectedResult1 = "Чапаев и Пустота [Пелевин]";
        if ((titleAndAuthor1.equals(expectedResult1)) && (titleAndAuthor2.equals(expectedResult2))) {
            System.out.println("List Of BooksTest OK");
        } else {
            System.out.println("List Of Books Test Failed");
        }
    }

    public void shouldCreateListOfBooksOfOneAuthorTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Generation „П“", "Пелевин");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        List<Book> booksOfOneAuthor = bookReader.searchByAuthor("Пелевин");
        Book bookOne = booksOfOneAuthor.get(0);
        Book bookTwo = booksOfOneAuthor.get(1);
        if (bookOne.equals(book1) && bookTwo.equals(book3)) {
            System.out.println("List Of Books Of One Author Test OK");
        } else {
            System.out.println("List Of Books Of One Author Test Failed");
        }
    }

    public void shouldCreateListOfBooksByPartOfAuthor() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Generation „П“", "Пелевин Виктор");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        List<Book> booksOfOneAuthor = bookReader.searchByPartOfAuthor("Пелев");
        Book bookOne = booksOfOneAuthor.get(0);
        Book bookTwo = booksOfOneAuthor.get(1);
        if (bookOne.equals(book1) && bookTwo.equals(book3)) {
            System.out.println("List Of Books By Part Of Author Test OK");
        } else {
            System.out.println("List Of Books By Part Of Author Test Failed");
        }
    }

    public void shouldCreateListOfBooksWithSameTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Чапаев и Пустота", "Какой-то мужик");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        List<Book> booksOfOneAuthor = bookReader.searchBookByTitle("Чапаев и Пустота");
        Book bookOne = booksOfOneAuthor.get(0);
        Book bookTwo = booksOfOneAuthor.get(1);
        if (bookOne.equals(book1) && bookTwo.equals(book3)) {
            System.out.println("List Of Books With Same Title Test OK");
        } else {
            System.out.println("List Of Books With Same Title Test Failed");
        }
    }

    public void shouldCreateListOfBooksByPartOfTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Чапаев и кто-то там еще", "Пелевин");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        List<Book> booksWithSameTitle = bookReader.searchByPartOfTitle("Чапаев");
        Book bookOne = booksWithSameTitle.get(0);
        Book bookTwo = booksWithSameTitle.get(1);
        if (bookOne.equals(book1) && bookTwo.equals(book3)) {
            System.out.println("List Of Books With Same Part Of Title Test OK");
        } else {
            System.out.println("List Of Books With Same Part Of Title Test Failed");
        }
    }

    public void shouldMakeBookFinishedTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        bookReader.bookWasRead(book1);
        boolean wasRead = book1.isBookWasRead();
        if (wasRead) {
            System.out.println("Book Was Finished Test OK");
        } else {
            System.out.println("Book Was Finished Test Failed");
        }
    }

    public void shouldMakeBookFinishedTest2() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        bookReader.bookWasRead(book2);
        boolean wasRead = book2.isBookWasRead();
        if (!wasRead) {
            System.out.println("Book Was Finished Test 2 OK");
        } else {
            System.out.println("Book Was Finished Test 2 Failed");
        }
    }

    public void shouldMakeBookUnreadTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        bookReader.bookWasRead(book1);
        bookReader.bookWasNotRead(book1);
        boolean wasRead = book1.isBookWasRead();
        if (!wasRead) {
            System.out.println("Unread Book Test OK");
        } else {
            System.out.println("Unread Book Test Failed");
        }
    }

    public void shouldCreateListOfFinishedBooksTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Generation „П“", "Пелевин");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.bookWasRead(book1);
        bookReader.bookWasRead(book3);
        List<String> finishedBooks = bookReader.booksWasReadList();
        String bookOne = finishedBooks.get(0);
        String bookTwo = finishedBooks.get(1);
        if ((bookOne.equals("Чапаев и Пустота [Пелевин]")) && (bookTwo.equals("Generation „П“ [Пелевин]"))) {
            System.out.println("Finished Books List Test OK");
        } else {
            System.out.println("Finished Books List Test Failed");
        }
    }

    public void shouldCreateListOfUnreadBooksTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Generation „П“", "Пелевин");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.bookWasRead(book1);
        List<String> unreadBooks = bookReader.unreadBooksList();
        String bookOne = unreadBooks.get(0);
        String bookTwo = unreadBooks.get(1);
        if ((bookOne.equals("Поваренная книга анархиста [Уильям Пауэлл]")) && (bookTwo.equals("Generation „П“ [Пелевин]"))) {
            System.out.println("List Of Unread Books Test OK");
        } else {
            System.out.println("List Of Unread Books Test Failed");
        }
    }
}
