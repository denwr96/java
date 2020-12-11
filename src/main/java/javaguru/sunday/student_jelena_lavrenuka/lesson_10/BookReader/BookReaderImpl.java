package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.BookReader;

// lesson_10 task_14
// lesson_10 task_15
// lesson_10 task_16
// lesson_10 task_17
// lesson_10 task_18
// lesson_10 task_19
// lesson_10 task_20
// lesson_10 task_21
// lesson_10 task_22
// lesson_10 task_23
// lesson_10 task_24
// lesson_10 task_25

import java.util.ArrayList;

class BookReaderImpl implements BookReader {
    ArrayList<Book> bookReader = new ArrayList<>();

    @Override
    public boolean addBookToLibrary(Book book) {
        if (!bookReader.contains(book) && checkBookTitleAuthor(book)) {
            bookReader.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkBookTitleAuthor(Book book) {
        return !(book.getBookTitle() == null | book.getBookAuthor() == null);
    }

    @Override
    public boolean deleteBookFromLibrary(Book book) {
        if (bookReader.contains(book)) {
            bookReader.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Book> findBookByAuthor(String bookAuthor) {
        ArrayList<Book> bookReaderToReturn = new ArrayList<>();
        for (Book findBookByAuthor : bookReader) {
            if (findBookByAuthor.getBookAuthor().equals(bookAuthor)) {
                bookReaderToReturn.add(findBookByAuthor);
            }
        }
        return bookReaderToReturn;
    }

    @Override
    public ArrayList<Book> findBookByNotFullAuthorsName(String tryingToFindAuthor) {
        ArrayList<Book> bookReaderToReturn = new ArrayList<>();
        for (Book findBookByAuthor : bookReader) {
            if (findBookByAuthor.getBookAuthor().contains(tryingToFindAuthor)) {
                bookReaderToReturn.add(findBookByAuthor);
            }
        }
        return bookReaderToReturn;
    }

    @Override
    public ArrayList<Book> findBookByTitle(String bookTitleToFind) {
        ArrayList<Book> bookReaderToReturn = new ArrayList<>();
        for (Book findBookByTitle : bookReader) {
            if (findBookByTitle.getBookTitle().equals(bookTitleToFind)) {
                bookReaderToReturn.add(findBookByTitle);
            }
        }
        return bookReaderToReturn;
    }

    @Override
    public ArrayList<Book> findBookByNotFullTitle(String tryingToFindBook) {
        ArrayList<Book> bookReaderToReturn = new ArrayList<>();
        for (Book findBookByTitle : bookReader) {
            if (findBookByTitle.getBookTitle().startsWith(tryingToFindBook)) {
                bookReaderToReturn.add(findBookByTitle);
            }
        }
        return bookReaderToReturn;
    }

    @Override
    public boolean markBookAsRead(Book book) {
        if (bookReader.contains(book)) {
            book.setMarkAsRead(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean markBookAsUnRead(Book book) {
        if (bookReader.contains(book)) {
            book.setMarkAsRead(false);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Book> readBooksList() {
        ArrayList<Book> bookReaderToReturn = new ArrayList<>();
        for (Book libraryList : bookReader) {
            if (libraryList.isMarkAsRead()) {
                bookReaderToReturn.add(libraryList);
            }
        }
        return bookReaderToReturn;
    }

    @Override
    public ArrayList<Book> unReadBooksList() {
        ArrayList<Book> bookReaderToReturn = new ArrayList<>();
        for (Book libraryList : bookReader) {
            if (!libraryList.isMarkAsRead()) {
                bookReaderToReturn.add(libraryList);
            }
        }
        return bookReaderToReturn;
    }
}
