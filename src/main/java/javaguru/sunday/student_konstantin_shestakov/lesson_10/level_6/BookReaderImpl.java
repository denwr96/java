package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_6;

// Task 14 - 25

import java.util.Arrays;

class BookReaderImpl implements BookReader {

    Book[] bookArray = new Book[6];

    public boolean checkBookAuthor(Book book) {
        return book.getAuthor() != null;
    }

    public boolean checkBookTitle(Book book) {
        return book.getTitle() != null;
    }

    public boolean checkForSameBook(Book book) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            if (bookArray[i].equals(book)) {
                return true;
            }
        }
        return false;
    }

    public boolean addBook(Book book) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null && !checkForSameBook(book) && checkBookTitle(book) && checkBookAuthor(book)) {
                bookArray[i] = book;
                System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]" + " - book added");
                return  true;
            }
        }
        System.out.println("Book is not added, please check if same book is already in library or title / author fields are empty");
        return false;
    }

    public Book findBook(Book book) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].equals(book)) {
                System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]" + " - is element " + (i + 1));
                return bookArray[i];
            }
        }
        System.out.println("Sorry, no such book in library");
        return null;
    }

    public boolean removeBook(Book book) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].equals(book)) {
                System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]" + " - book removed");
                bookArray[i] = null;
                return true;
            }
        }
        System.out.println("Sorry, no such book to remove");
        return false;
    }

    public void printBookList() {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]");
        }
    }

    public Book[] findBookByAuthor(String author) {
        Book[] booksFound = new Book[bookArray.length];

        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            if (bookArray[i].getAuthor().equals(author)) {
                booksFound[i] = bookArray[i];
                System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]" + " is element " + (i + 1));
            }
        }
//        System.out.println(Arrays.deepToString(booksFound));
        return booksFound;
    }

    public Book[] findBookByAuthorPartialWordSearch(String author) {
        Book[] booksFound = new Book[bookArray.length];

        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            String[] findAuthorArray = bookArray[i].getAuthor().split("[ ~!@#$%^&*()_+`1234567890-={}:;'|<>,./?]");

            for (int j = 0; j < findAuthorArray.length; j++) {
                if (findAuthorArray[j].equals(author)) {
                    System.out.println(bookArray[i].toString() + " is element " + (i + 1));
                    booksFound[i] = bookArray[i];
                    System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]");
                }
            }
        }
        return booksFound;
    }

    public Book[] findBookByTitle(String title) {
        Book[] booksFound = new Book[bookArray.length];

        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            if (bookArray[i].getTitle().equals(title)) {
                booksFound[i] = bookArray[i];
                System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]" + " is element " + (i + 1));
            }
        }
        return booksFound;
    }

    public Book[] findBookByTitlePartialSearch(String title) {
        Book[] booksFound = new Book[bookArray.length];

        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            String[] findTitleArray = bookArray[i].getTitle().split("[ ~!@#$%^&*()_+`1234567890-={}:;'|<>,./?]");

            for (int j = 0; j < findTitleArray.length; j++) {
                if (findTitleArray[j].equals(title)) {
                    booksFound[i] = bookArray[i];
                    System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]" + " is element " + (i + 1));
                }
            }

        }
        return booksFound;
    }

    public boolean bookIsAlreadyRead(Book book) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            if (bookArray[i].equals(book)) {
                bookArray[i].setBookIsRead(true);
                System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]" + " - is set as read");
                return true;
            }
        }
        System.out.println("There's no such book in library");
        return false;
    }

    public boolean bookIsUnread(Book book) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            if (bookArray[i].equals(book)) {
                bookArray[i].setBookIsRead(false);
                System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]" + " - is set as unread");
                return true;
            }
        }
        System.out.println("There's no such book in library");
        return false;
    }

    public void printReadBookList() {
        System.out.println("Read books list: ");
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            if (bookArray[i].getBookIsRead()) {
                System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]");
            }
        }

    }

    public void printUnreadReadBookList() {
        System.out.println("Unread books list: ");
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            if (!bookArray[i].getBookIsRead()) {
                System.out.println(bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]");
            }
        }
    }
}
