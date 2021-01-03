package javaguru.sunday.student_nataliya_sinitsa.lesson10.level6.task14;

//Task 14 -> 25

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = false)
@CodeReviewComment(comment = "Вы используете ArrayList<> при возвращении значения из методов. Зачем? Нужно использовать интерфейс. Не переходить на имплементацию." +
        "Зачем используете массивы? Заменить на коллекции")
class BookReaderImpl implements BookReader {

    List<Book> bookList = new ArrayList<>();

    @Override
    public boolean bookHasAuthorAndTitle(Book newBook) {
        return !(newBook.getBookAuthor() == null && newBook.getBookTitle() == null);
    }

    @Override
    public boolean addBook(Book newBook) {
        for (Book bookInList : bookList) {
            if (bookInList.equals(newBook) || !bookHasAuthorAndTitle(newBook)) {
                return false;
            }
        }
        bookList.add(newBook);
        return true;
    }

    @Override
    public boolean removeBook(Book bookToRemove) {
        for (Book bookInList : bookList) {
            if (bookInList.equals(bookToRemove)) {
                bookList.remove(bookInList);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<String> availableBooks() {
        List<String> listOfAvailableBooks = new ArrayList<>();
        for (Book bookInList : bookList) {
            listOfAvailableBooks.add(bookInList.getBookTitle() + " [" + bookInList.getBookAuthor() + "]");
        }
        return listOfAvailableBooks;
    }

    @Override
    public List<Book> bookListByAuthor(String requestedAuthor)  {
        List<Book> bookListByAuthor = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (bookInList.getBookAuthor().equals(requestedAuthor)) {
                bookListByAuthor.add(bookInList);
            }
        }
        return bookListByAuthor;
    }

    @Override
    public List<Book> bookListByPartOfAuthorName(String partOfRequestedAuthorName) {
        List<Book> bookListByPartOfAuthorName = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (bookInList.getBookAuthor().contains(partOfRequestedAuthorName)) {
                bookListByPartOfAuthorName.add(bookInList);
            }
        }
        return bookListByPartOfAuthorName;
    }

    @Override
    public List<Book> bookListByTitle(String requestedTitle) {
        List<Book> bookListByTitle = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (bookInList.getBookTitle().equals(requestedTitle)) {
                bookListByTitle.add(bookInList);
            }
        }
        return bookListByTitle;
    }

    @Override
    public List<Book> bookListByPartOfTitle(String partOfRequestedTitle) {
        List<Book> bookListByPartOfTitle = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (bookInList.getBookTitle().contains(partOfRequestedTitle)) {
                bookListByPartOfTitle.add(bookInList);
            }
        }
        return bookListByPartOfTitle;
    }

    @Override
    public boolean markAsRead(Book bookToMark) {
        for (Book bookInList : bookList) {
            if (bookInList.equals(bookToMark)) {
                bookInList.isRead = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean markAsUnread(Book bookToMark) {
        for (Book bookInList : bookList) {
            if (bookInList.equals(bookToMark)) {
                bookInList.isRead = false;
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Book> listOfReadBooks() {
        List<Book> listOfReadBooks = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (bookInList.isRead) {
                listOfReadBooks.add(bookInList);
            }
        }
        return listOfReadBooks;
    }

    @Override
    public List<Book> listOfUnreadBooks() {
        List<Book> listOfUnreadBooks = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (!bookInList.isRead) {
                listOfUnreadBooks.add(bookInList);
            }
        }
        return listOfUnreadBooks;
    }

}

