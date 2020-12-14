package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_6;

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

public class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest bookReaderTest = new BookReaderTest();
        bookReaderTest.addBookTest1();
        bookReaderTest.addBookTest2();
        bookReaderTest.bookWithoutAuthorTest();
        bookReaderTest.deleteTest();
        bookReaderTest.deleteTest2();
        bookReaderTest.listOfBooksTest();
        bookReaderTest.booksOfOneAuthor();
        bookReaderTest.bookWithFirstLettersOfAuthor();
        bookReaderTest.booksWithThisTitle();
        bookReaderTest.bookWithFirstLettersOfTitle();
        bookReaderTest.iReadThisBookTest();
        bookReaderTest.iReadThisBookTest2();
        bookReaderTest.iDoNotReadThisBookTest();
        bookReaderTest.booksIWasReadTest();
        bookReaderTest.booksIWasNotReadTest();
    }

    public void addBookTest1() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Чапаев и Пустота", "Пелевин");
        boolean bookIsAdd = bookReader.addBook(book);
        if (bookIsAdd) {
            System.out.println("addBookTest Ok");
        } else {
            System.out.println("AddBookTest Failed");
        }
    }

    public void addBookTest2() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        boolean bookIsAdd = bookReader.addBook(book3);
        if (bookIsAdd) {
            System.out.println("addBookTest2 Failed");
        } else {
            System.out.println("addBookTest2 Ok");
        }
    }

    public void bookWithoutAuthorTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Конституция РФ", "");
        boolean bookIsAdd = bookReader.addBook(book);
        if (bookIsAdd) {
            System.out.println("BookWithoutAuthorTest Failed");
        } else {
            System.out.println("BookWithoutAuthorTest OK");
        }
    }

    public void deleteTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        boolean bookIsDelete = bookReader.deleteBook(book2);
        if (!bookIsDelete) {
            System.out.println("DeleteTest OK");
        } else {
            System.out.println("DeleteTest Failed");
        }
    }

    public void deleteTest2() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        bookReader.addBook(book2);
        boolean bookIsDelete = bookReader.deleteBook(book1);
        if (bookIsDelete) {
            System.out.println("DeleteTest OK");
        } else {
            System.out.println("DeleteTest Failed");
        }
    }

    public void listOfBooksTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        ArrayList<String> myBooks = bookReader.listOfTheBooks();
        String titleAndAuthor1 = myBooks.get(0);
        String titleAndAuthor2 = myBooks.get(1);
        String expectedResult2 = "Поваренная книга анархиста [Уильям Пауэлл]";
        String expectedResult1 = "Чапаев и Пустота [Пелевин]";
        if ((titleAndAuthor1.equals(expectedResult1)) && (titleAndAuthor2.equals(expectedResult2))) {
            System.out.println("listOfBooksTest OK");
        } else {
            System.out.println("listOfBooksTest Failed");
        }
    }

    public void booksOfOneAuthor() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Generation „П“", "Пелевин");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        ArrayList<Book> booksOfOneAuthor = bookReader.findBookByAuthor("Пелевин");
        Book bookOne = booksOfOneAuthor.get(0);
        Book bookTwo = booksOfOneAuthor.get(1);
        if (bookOne.equals(book1) && bookTwo.equals(book3)) {
            System.out.println("booksOfOneAuthorTest OK");
        } else {
            System.out.println("booksOfOneAuthorTest Failed");
        }
    }

    public void bookWithFirstLettersOfAuthor() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Generation „П“", "Пелевин Виктор");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        ArrayList<Book> booksOfOneAuthor = bookReader.findBookByFirstLettersOfAuthor("Пелевин");
        Book bookOne = booksOfOneAuthor.get(0);
        Book bookTwo = booksOfOneAuthor.get(1);
        if (bookOne.equals(book1) && bookTwo.equals(book3)) {
            System.out.println("booksWithFirstLettersOfAuthorTest OK");
        } else {
            System.out.println("booksWithFirstLettersOfAuthorTest Failed");
        }
    }

    public void booksWithThisTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Чапаев и Пустота", "Какой-то мужик");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        ArrayList<Book> booksOfOneAuthor = bookReader.findBookByTitle("Чапаев и Пустота");
        Book bookOne = booksOfOneAuthor.get(0);
        Book bookTwo = booksOfOneAuthor.get(1);
        if (bookOne.equals(book1) && bookTwo.equals(book3)) {
            System.out.println("booksWithOneTitleTest OK");
        } else {
            System.out.println("booksWithOneTitleTest Failed");
        }
    }

    public void bookWithFirstLettersOfTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Чапаев и кто-то там еще", "Пелевин");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        ArrayList<Book> booksWithSameTitle = bookReader.findBookByFirstLettersOfTitle("Чапаев");
        Book bookOne = booksWithSameTitle.get(0);
        Book bookTwo = booksWithSameTitle.get(1);
        if (bookOne.equals(book1) && bookTwo.equals(book3)) {
            System.out.println("booksByFirstLettersOfTitleTest OK");
        } else {
            System.out.println("booksByFirstLettersOfTitleTest Failed");
        }
    }

    public void iReadThisBookTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        boolean returningValue = bookReader.bookWasRead(book1);
        boolean wasRead = book1.getWasBookRead();
        if (wasRead && returningValue) {
            System.out.println("WasReadTest Ok");
        } else {
            System.out.println("WasReadTest Failed");
        }
    }

    public void iReadThisBookTest2() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        boolean returningValue = bookReader.bookWasRead(book2);
        boolean wasRead = book2.getWasBookRead();
        if (!wasRead && !returningValue) {
            System.out.println("WasReadTest2 Ok");
        } else {
            System.out.println("WasReadTest2 Failed");
        }
    }

    public void iDoNotReadThisBookTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        bookReader.addBook(book1);
        boolean returningValue = bookReader.bookWasNotRead(book1);
        boolean wasRead = book1.getWasBookRead();
        if (!wasRead && returningValue) {
            System.out.println("Wasn'tReadTest Ok");
        } else {
            System.out.println("Wasn'tReadTest Failed");
        }
    }

    public void booksIWasReadTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Generation „П“", "Пелевин");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        book1.bookWasReadBecomeTrue();
        book3.bookWasReadBecomeTrue();
        ArrayList<String> bookWasRead = bookReader.booksIWasRead();
        String bookOne = bookWasRead.get(0);
        String bookTwo = bookWasRead.get(1);
        if ((bookOne.equals("Чапаев и Пустота [Пелевин]")) && (bookTwo.equals("Generation „П“ [Пелевин]"))) {
            System.out.println("booksIWasReadTest OK");
        } else {
            System.out.println("booksIWasReadTest Failed");
        }
    }

    public void booksIWasNotReadTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Чапаев и Пустота", "Пелевин");
        Book book2 = new Book("Поваренная книга анархиста", "Уильям Пауэлл");
        Book book3 = new Book("Generation „П“", "Пелевин");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        book1.bookWasReadBecomeTrue();
        ArrayList<String> bookWasNotRead = bookReader.booksIWasNotRead();
        String bookOne = bookWasNotRead.get(0);
        String bookTwo = bookWasNotRead.get(1);
        if ((bookOne.equals("Поваренная книга анархиста [Уильям Пауэлл]")) && (bookTwo.equals("Generation „П“ [Пелевин]"))) {
            System.out.println("booksIWasNotReadTest OK");
        } else {
            System.out.println("booksIWasNotReadTest Failed");
        }
    }
}
