package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level6.task14;

//Task 14 -> 25

import java.util.ArrayList;

class BookReaderImpl implements BookReader {

    ArrayList<Book> bookList = new ArrayList<>();

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
    public String[] availableBooks() {
        String[] listOfAvailableBooks = new String[bookList.size()];
        for (int i = 0; i < bookList.size(); i++) {
            listOfAvailableBooks[i] = bookList.get(i).getBookTitle() + " [" + bookList.get(i).getBookAuthor() + "]";
        }
        return listOfAvailableBooks;
    }

    @Override
    public ArrayList<Book> bookListByAuthor(String requestedAuthor)  {
        ArrayList<Book> bookListByAuthor = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (bookInList.getBookAuthor().equals(requestedAuthor)) {
                bookListByAuthor.add(bookInList);
            }
        }
        return bookListByAuthor;
    }

    @Override
    public ArrayList<Book> bookListByPartOfAuthorName(String partOfRequestedAuthorName) {
        ArrayList<Book> bookListByPartOfAuthorName = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (bookInList.getBookAuthor().contains(partOfRequestedAuthorName)) {
                bookListByPartOfAuthorName.add(bookInList);
            }
        }
        return bookListByPartOfAuthorName;
    }

    @Override
    public ArrayList<Book> bookListByTitle(String requestedTitle) {
        ArrayList<Book> bookListByTitle = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (bookInList.getBookTitle().equals(requestedTitle)) {
                bookListByTitle.add(bookInList);
            }
        }
        return bookListByTitle;
    }

    @Override
    public ArrayList<Book> bookListByPartOfTitle(String partOfRequestedTitle) {
        ArrayList<Book> bookListByPartOfTitle = new ArrayList<>();
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
    public ArrayList<Book> listOfReadBooks() {
        ArrayList<Book> listOfReadBooks = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (bookInList.isRead) {
                listOfReadBooks.add(bookInList);
            }
        }
        return listOfReadBooks;
    }

    @Override
    public ArrayList<Book> listOfUnreadBooks() {
        ArrayList<Book> listOfUnreadBooks = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (!bookInList.isRead) {
                listOfUnreadBooks.add(bookInList);
            }
        }
        return listOfUnreadBooks;
    }

}
