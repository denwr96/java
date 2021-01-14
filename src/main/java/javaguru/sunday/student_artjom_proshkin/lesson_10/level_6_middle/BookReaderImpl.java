package javaguru.sunday.student_artjom_proshkin.lesson_10.level_6_middle;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class BookReaderImpl implements BookReader {

    List<Book> bookLibrary = new ArrayList<>();
    //Task_14
    @Override
    public boolean addBook(Book book) {
        if(checkIfBookIsAdded(book) && checkBookAuthorAndTitle(book)) {
            bookLibrary.add(book);
            return true;
        }
        return false;
    }
    //Task_14
    @Override
    public boolean checkIfBookIsAdded(Book book) {
        for (Book bookInLibrary : bookLibrary) {
            if (bookInLibrary != null && bookInLibrary.equals(book)) {
                return false;
            }
        }
        return true;
    }
    //Task_15
    @Override
    public boolean checkBookAuthorAndTitle(Book book) {
        return !book.getBookAuthor().equals("") && !book.getBookTitle().equals("");
    }
    //Task_16
    @Override
    public boolean deleteBook(Book book) {
        for (Book bookInLibrary : bookLibrary) {
            if (bookInLibrary != null && bookInLibrary.equals(book)) {
                bookLibrary.remove(book);
                return true;
            }
        }
        return false;
    }
    //Task_17
    @Override
    public List<String> showSavedBooks(List<Book> books) {
        List<String> savedBooks = new ArrayList<>();
        for (Book bookInLibrary : books) {
            savedBooks.add(bookInLibrary.getBookTitle() + " [" + bookInLibrary.getBookAuthor() + "]");
        }
        return savedBooks;
    }
    //Task_18
    @Override
    public List<Book> findBookByAuthor(String author) {
        List<Book> authorMatchBooks = new ArrayList<>();
        for (Book book : bookLibrary) {
            if (book.getBookAuthor().equals(author)) {
                authorMatchBooks.add(book);
            }
        }
        return authorMatchBooks;
    }
    //Task_19
    @Override
    public List<Book> findBookByAuthorPart(String authorPart) {
        List<Book> authorPartMatchBooks = new ArrayList<>();
        for (Book book : bookLibrary) {
            if (book.getBookAuthor().contains(authorPart)) {
                authorPartMatchBooks.add(book);
            }
        }
        return authorPartMatchBooks;
    }
    //Task_20
    @Override
    public List<Book> findBookByTitle(String title) {
        List<Book> titleMatchBooks = new ArrayList<>();
        for (Book book : bookLibrary) {
            if (book.getBookTitle().equals(title)) {
                titleMatchBooks.add(book);
            }
        }
        return titleMatchBooks;
    }
    //Task_21
    @Override
    public List<Book> findBookByTitlePart(String titlePart) {
        List<Book> titlePartMatchBooks = new ArrayList<>();
        for (Book book : bookLibrary) {
            if (book.getBookTitle().contains(titlePart)) {
                titlePartMatchBooks.add(book);
            }
        }
        return titlePartMatchBooks;
    }
    //Task_22
    @Override
    public boolean bookWasRead(Book book) {
        for (Book bookInLibrary : bookLibrary) {
            if (bookInLibrary.equals(book)) {
                bookInLibrary.alreadyRead = true;
                return true;
            }
        }
        return false;
    }
    //Task_23
    @Override
    public boolean bookWasNotRead(Book book) {
        for (Book bookInLibrary : bookLibrary) {
            if (bookInLibrary.equals(book)) {
                bookInLibrary.alreadyRead = false;
                return true;
            }
        }
        return false;
    }
    //Task_24
    @Override
    public List<String> showAllReadBooks(List<Book> books) {
        List<String> allReadBooks = new ArrayList<>();
        for (Book bookInLibrary : books) {
            if (bookInLibrary.isAlreadyRead()) {
                allReadBooks.add(bookInLibrary.getBookTitle() + " [" + bookInLibrary.getBookAuthor() + "]");
            }
        }
        return allReadBooks;
    }
    //Task_25
    @Override
    public List<String> showAllUnreadBooks(List<Book> books) {
        List<String> allUnreadBooks = new ArrayList<>();
        for (Book bookInLibrary : books) {
            if (!bookInLibrary.isAlreadyRead()) {
                allUnreadBooks.add(bookInLibrary.getBookTitle() + " [" + bookInLibrary.getBookAuthor() + "]");
            }
        }
        return allUnreadBooks;
    }

    @Override
    public String toString() {
        return "BookReaderImpl{" +
                "bookArray=" + bookLibrary +
                '}';
    }
}
