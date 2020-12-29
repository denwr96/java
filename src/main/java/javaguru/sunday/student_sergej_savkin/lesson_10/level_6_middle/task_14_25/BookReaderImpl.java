package javaguru.sunday.student_sergej_savkin.lesson_10.level_6_middle.task_14_25;

//task14to25

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@CodeReview(approved = false)
@CodeReviewComment(comment = "Почему сделали используя массивы? Переделайте не коллекции.")
class BookReaderImpl implements BookReader {

    List<Book> bookArray = new ArrayList<>();

    @Override
    public boolean checkIfBookAlreadyAdded(Book book) {
        for (Book value : bookArray) {
            if (value == null) {
                continue;
            }
            if (value.equals(book)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addBook(Book book) {
        if(checkIfBookAlreadyAdded(book) && checkIfBookHasTitleAndAuthor(book)) {
            bookArray.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkIfBookHasTitleAndAuthor(Book book) {
        return !book.getAuthor().equals("") || !book.getBookName().equals("");
    }

    @Override
    public boolean deleteBook(Book book) {
        for (int i = 0; i < bookArray.size(); i++) {
            if (bookArray.get(i) == null) {
                continue;
            }
            if (bookArray.get(i).equals(book)) {
                bookArray.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<String> showBookList(List<Book> book) {
        List<String> bookList = new ArrayList<>();
        for (Book value : book) {
            bookList.add(value.getBookName() + " [" + value.getAuthor() + "]");
        }
        return bookList;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> foundByAuthorBookArray = new ArrayList<>();
        for (Book book : bookArray) {
            if (book.getAuthor().equals(author)) {
                foundByAuthorBookArray.add(book);
            }
        }
        return foundByAuthorBookArray;
    }

    @Override
    public List<Book> searchByAuthorBeginning(String authorBeginning) {
        List<Book> foundByAuthorBeginningBookArray = new ArrayList<>();
        for (Book book : bookArray) {
            if (book.getAuthor().contains(authorBeginning)) {
                foundByAuthorBeginningBookArray.add(book);
            }
        }
        return foundByAuthorBeginningBookArray;
    }

    @Override
    public List<Book> searchByTitle(String title) {
        List<Book> foundByTitleBookArray = new ArrayList<>();
        for (Book book : bookArray) {
            if (book.getBookName().equals(title)) {
                foundByTitleBookArray.add(book);
            }
        }
        return foundByTitleBookArray;
    }

    @Override
    public List<Book> searchByTitleBeginning(String titleBeginning) {
        List<Book> foundByTitleBeginningBookArray = new ArrayList<>();
        for (Book book : bookArray) {
            if (book.getBookName().contains(titleBeginning)) {
                foundByTitleBeginningBookArray.add(book);
            }
        }
        return foundByTitleBeginningBookArray;
    }

    @Override
    public boolean setBookAsRed(Book book) {
        for (Book value : bookArray) {
            if (value.equals(book)) {
                value.isRed = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setBookAsNotRed(Book book) {
        for (Book value : bookArray) {
            if (value.equals(book)) {
                value.isRed = false;
                return true;
            }
        }
        return false;
    }

    @Override
    public List<String> getRedBookList(List<Book> book) {
        List<String> bookList = new ArrayList<>();
        for (Book value : book) {
            if (value.getIsRedStatus()) {
                bookList.add(value.getBookName() + " [" + value.getAuthor() + "]");
            }
        }
        return bookList;
    }

    @Override
    public List<String> getNotRedBookList(List<Book> book) {
        List<String> bookList = new ArrayList<>();
        for (Book value : book) {
            if (!value.getIsRedStatus()) {
                bookList.add(value.getBookName() + " [" + value.getAuthor() + "]");
            }
        }
        return bookList;
    }

    @Override
    public String toString() {
        return "BookReaderImpl{" +
                "bookArray=" + bookArray +
                '}';
    }
}
