package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_6;
//task14
//task15
//task16
//task17
//task18
//task19
//task20
//task21
//task22
//task23
//task24
//task25

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class BookReaderImpl implements BookReader {

    List<Book> bookList;

    public BookReaderImpl(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean checkIfBookExistInList(Book book) {
        for (Book value : bookList) {
            if (value.getTitle().equals(book.getTitle()) &&
                    value.getAuthor().equals(book.getAuthor())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkBookTitle(Book book) {
        if (book.getTitle().equals("")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean checkBookAuthor(Book book) {
        if (book.getAuthor().equals("")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean add(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            if (checkIfBookExistInList(book) || checkBookTitle(book) || checkBookAuthor(book)) {
                System.out.println("Book is already in the list or title/author is missing");
                return false;
            }

        }
        return bookList.add(book);
    }

    @Override
    public boolean remove(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            if (!checkIfBookExistInList(book)) {
                System.out.println("Book is not in the list");
                return false;
            }
        }
        bookList.remove(book);
        return true;
    }

    @Override
    public void printBookList() {
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    @Override
    public ArrayList<Book> findBookByAuthor(String Author) {
        ArrayList<Book> selectedBooks = new ArrayList<>();
        for (Book findBookByAuthor : bookList) {
            if (findBookByAuthor.getAuthor().equals(Author)) {
                selectedBooks.add(findBookByAuthor);
            }

        }
        return selectedBooks;
    }

    @Override
    public ArrayList<Book> findBookByAuthorPart(String authorPart) {
        ArrayList<Book> selectedBooks = new ArrayList<>();
        for (Book findBookByAuthorPart : bookList) {
            if (findBookByAuthorPart.getAuthor().contains(authorPart)) {
                selectedBooks.add(findBookByAuthorPart);
            }

        }
        return selectedBooks;
    }

    @Override
    public ArrayList<Book> findBookByTitle(String Title) {
        ArrayList<Book> selectedBooks = new ArrayList<>();
        for (Book findBookByAuthor : bookList) {
            if (findBookByAuthor.getTitle().contains(Title)) {
                selectedBooks.add(findBookByAuthor);
            }

        }
        return selectedBooks;
    }

    @Override
    public boolean markBookIsRead(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            if (!checkIfBookExistInList(book)) {
                return false;
            }

        }
        book.setMarkAsRead(true);
        return true;
    }

    @Override
    public boolean markBookIsNotRead(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            if (!checkIfBookExistInList(book)) {
                return false;
            }

        }
        book.setMarkAsRead(false);
        return true;
    }

    @Override
    public ArrayList<Book> readBookList() {
        ArrayList<Book> selectedBooks = new ArrayList<>();
        for (Book list : bookList) {
            if (list.isMarkAsRead()) {
                selectedBooks.add(list);
            }

        }
        return selectedBooks;
    }

    @Override
    public ArrayList<Book> unreadBookList() {
        ArrayList<Book> selectedBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (!book.isMarkAsRead()) {
                selectedBooks.add(book);
            }

        }
        return selectedBooks;
    }
}
