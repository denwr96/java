package main.java.javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_6_middle;

import java.util.ArrayList;

// task14, task15, task16, task17, task18, task19, task20, task21, task22, task23, task24, task25;

public class BookReaderImpl implements BookReader {

    private ArrayList<Book> books;

    public BookReaderImpl() {
        this.books = new ArrayList<Book>();
    }

    @Override
    public boolean addBook(Book book) {
        if (!books.contains(book)) {
            this.books.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean addBookV2(Book book) {
        if (!books.contains(book)) {
            if ((book.getTitle() != null && !book.getTitle().isEmpty()) && (book.getAuthor() != null && !book.getAuthor().isEmpty())) {
                this.books.add(book);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        if (books.contains(book)) {
            this.books.remove(book);
            return true;
        }
        return false;
    }


    @Override
    public ArrayList<String> getBooks() {
        ArrayList<String> allBooks = new ArrayList<>();
        for (Book book : books) {
            allBooks.add(book.toString());
        }
        return allBooks;
    }

    @Override
    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> searchMatches = new ArrayList<>();
        for (Book book : books) {
            if (author.equals(book.getAuthor()))
                searchMatches.add(book);
        }
        return searchMatches;
    }

    @Override
    public ArrayList<Book> findByAuthorBeginning(String author) {
        ArrayList<Book> searchMatches = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().startsWith(author))
                searchMatches.add(book);
        }
        return searchMatches;
    }

    @Override
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searchMatches = new ArrayList<>();
        for (Book book : books) {
            if (title.equals(book.getTitle()))
                searchMatches.add(book);
        }
        return searchMatches;
    }

    @Override
    public ArrayList<Book> searchByTitleBeginning(String title) {
        ArrayList<Book> searchMatches = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().startsWith(title))
                searchMatches.add(book);
        }
        return searchMatches;
    }

    @Override
    public boolean setBookAsRed(Book book) {
        if (books.contains(book)) {
            book.setRead(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean setBookAsNotRed(Book book) {
        if (books.contains(book)) {
            book.setRead(false);
            return true;
        }
        return false;
    }

    public ArrayList<String> getRedBookList() {
        ArrayList<String> redBookList = new ArrayList<>();
        for (Book book : books) {
            if (book.isRead() == true) {
                redBookList.add(book.toString());
            }
        }
        return redBookList;
    }

    public ArrayList<String> getNotRedBookList() {
        ArrayList<String> redBookList = new ArrayList<>();
        for (Book book : books) {
            if (book.isRead() == false) {
                redBookList.add(book.toString());
            }
        }
        return redBookList;
    }
}