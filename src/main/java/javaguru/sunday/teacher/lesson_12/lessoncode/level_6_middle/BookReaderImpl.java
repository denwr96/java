package javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.List;

// task14, task15, task16, task17, task18, task19, task20, task21, task22, task23, task24, task25;
public class BookReaderImpl implements BookReader {

    private List<Book> booksStorage;

    public BookReaderImpl(List<Book> booksStorage) {
        this.booksStorage = booksStorage;
    }

    @Override
    public void addBook(Book book) throws BookAlreadyExistsException {
        if (book == null) {
            throw new InputParameterValidationException("Input parameter is null");
        }

        if (!booksStorage.contains(book)) {
            this.booksStorage.add(book);
        } else {
            throw new BookAlreadyExistsException("This book already exists in the storage");
        }
    }

    @Override
    public boolean addBookV2(Book book) {
        if (!booksStorage.contains(book)) {
            if ((book.getTitle() != null && !book.getTitle().isEmpty()) && (book.getAuthor() != null && !book.getAuthor().isEmpty())) {
                this.booksStorage.add(book);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        if (booksStorage.contains(book)) {
            this.booksStorage.remove(book);
            return true;
        }
        return false;
    }


    @Override
    public ArrayList<String> getBooks() {
        ArrayList<String> allBooks = new ArrayList<>();
        for (Book book : booksStorage) {
            allBooks.add(book.toString());
        }
        return allBooks;
    }

    @Override
    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> searchMatches = new ArrayList<>();
        for (Book book : booksStorage) {
            if (author.equals(book.getAuthor()))
                searchMatches.add(book);
        }
        return searchMatches;
    }

    @Override
    public ArrayList<Book> findByAuthorBeginning(String author) {
        ArrayList<Book> searchMatches = new ArrayList<>();
        for (Book book : booksStorage) {
            if (book.getAuthor().startsWith(author))
                searchMatches.add(book);
        }
        return searchMatches;
    }

    @Override
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searchMatches = new ArrayList<>();
        for (Book book : booksStorage) {
            if (title.equals(book.getTitle()))
                searchMatches.add(book);
        }
        return searchMatches;
    }

    @Override
    public ArrayList<Book> searchByTitleBeginning(String title) {
        ArrayList<Book> searchMatches = new ArrayList<>();
        for (Book book : booksStorage) {
            if (book.getTitle().startsWith(title))
                searchMatches.add(book);
        }
        return searchMatches;
    }

    @Override
    public boolean setBookAsRed(Book book) {
        if (booksStorage.contains(book)) {
            book.setRead(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean setBookAsNotRed(Book book) {
        if (booksStorage.contains(book)) {
            book.setRead(false);
            return true;
        }
        return false;
    }

    public ArrayList<String> getRedBookList() {
        ArrayList<String> redBookList = new ArrayList<>();
        for (Book book : booksStorage) {
            if (book.isRead() == true) {
                redBookList.add(book.toString());
            }
        }
        return redBookList;
    }

    public ArrayList<String> getNotRedBookList() {
        ArrayList<String> redBookList = new ArrayList<>();
        for (Book book : booksStorage) {
            if (book.isRead() == false) {
                redBookList.add(book.toString());
            }
        }
        return redBookList;
    }
}