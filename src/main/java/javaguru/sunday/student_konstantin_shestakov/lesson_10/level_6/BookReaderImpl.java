package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_6;

// Task 14 - 25

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Переделать на коллекции.")
class BookReaderImpl implements BookReader {

    List<Book> booksLibrary = new ArrayList<>();
    Book[] bookArray = new Book[6];

    @Override
    public boolean checkForSameBook(Book book) {
        for (Book value : booksLibrary) {
            if (value.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addBook(Book book) {
        for (int i = 0; i < booksLibrary.size(); i++) {
            if (checkForSameBook(book) || book.getAuthor().equals("") || book.getTitle().equals("")) {
                System.out.println("Book is not added, please check if same book is already in library or title / author fields are empty");
                return  false;
            }
        }
        booksLibrary.add(book);
        return true;
    }

    @Override
    public Book findBook(Book book) {
        for (int i = 0; i < booksLibrary.size(); i++) {
            if (booksLibrary.get(i).equals(book)) {
                System.out.println(booksLibrary.get(i).getTitle() + " [" + booksLibrary.get(i).getAuthor() + "]" + " - is element " + (i + 1));
                return booksLibrary.get(i);
            }
        }
        System.out.println("Sorry, no such book in library");
        return null;
    }

    @Override
    public boolean removeBook(Book book) {
        for (int i = 0; i < booksLibrary.size(); i++) {
            if (booksLibrary.get(i).equals(book)) {
                System.out.println(booksLibrary.get(i).getTitle() + " [" + booksLibrary.get(i).getAuthor() + "]" + " - book removed");
                booksLibrary.remove(book);
                return true;
            }
        }
        System.out.println("Sorry, no such book to remove");
        return false;
    }

    @Override
    public void printBookList() {
        for (Book book : booksLibrary) {
            System.out.println(book.getTitle() + " [" + book.getAuthor() + "]");
        }
    }

    @Override
    public List<Book> findBookByAuthor(String author) {
        List<Book> booksFound = new ArrayList<>();

        for (Book book : booksLibrary) {
            if (book.getAuthor().equals(author)) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }

    @Override
    public List<Book> findBookByAuthorStartsWithWordSearch(String author) {
        List<Book> booksFound = new ArrayList<>();

        for (Book book : booksLibrary) {
            if (book.getAuthor().startsWith(author)) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }


    @Override
    public List<Book> findBookByTitle(String title) {
        List<Book> booksFound = new ArrayList<>();

        for (Book book : booksLibrary) {
            if (book.getTitle().equals(title)) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }

    @Override
    public List<Book> findBookByTitleStartsWithWordSearch(String title) {
        List<Book> booksFound = new ArrayList<>();

        for (Book book : booksLibrary) {
            if (book.getTitle().startsWith(title)) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }

    @Override
    public boolean bookIsAlreadyRead(Book book) {
        for (Book value : booksLibrary) {

            if (value.equals(book)) {
                value.setBookIsRead(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean bookIsUnread(Book book) {
        for (Book value : booksLibrary) {

            if (value.equals(book)) {
                value.setBookIsRead(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public void printReadBookList() {
        System.out.println("Read books list: ");
        for (Book book : booksLibrary) {
            if (book.getBookIsRead()) {
                System.out.println(book.getTitle() + " [" + book.getAuthor() + "]");
            }
        }
    }

    @Override
    public void printUnreadBookList() {
        System.out.println("Unread books list: ");
        for (Book book : booksLibrary) {
            if (!book.getBookIsRead()) {
                System.out.println(book.getTitle() + " [" + book.getAuthor() + "]");
            }
        }
    }
}
