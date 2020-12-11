package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_6_middle.task_14_25;

//task14to25

import java.util.Arrays;

class BookReaderImpl implements BookReader {

    Book[] bookArray = new Book[10];

    @Override
    public boolean checkIfBookAlreadyAdded(Book book) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            if (bookArray[i].equals(book)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addBook(Book book) {
        if(checkIfBookAlreadyAdded(book) && checkIfBookHasTitleAndAuthor(book)) {
            for (int i = 0; i < bookArray.length; i++) {
                if(bookArray[i] == null) {
                    bookArray[i] = book;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean checkIfBookHasTitleAndAuthor(Book book) {
        if(book.getAuthor() == "" && book.getBookName() == "") {
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteBook(Book book) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            if (bookArray[i].equals(book)) {
                bookArray[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] showBookList(Book[] book) {
        int bookCounter = 0;
        for (int i = 0; i < book.length; i++) {
            if(book[i] != null) {
                bookCounter++;
            }
        }
        String[] bookList = new String[bookCounter];
        int arrayFillCounter = 0;
        for (int i = 0; i < book.length; i++) {
            if(book[i] == null){
                continue;
            }
            bookList[arrayFillCounter] = book[i].getBookName() + " [" + book[i].getAuthor() + "]";
            arrayFillCounter++;
        }
        return bookList;
    }

    @Override
    public Book[] searchByAuthor(String author) {
        int authorCounter = 0;
        for (int i = 0; i < bookArray.length; i++) {
            if(bookArray[i] == null) {
                continue;
            } else if (bookArray[i].getAuthor().equals(author)) {
                authorCounter++;
            }
        }
        Book[] foundByAuthorBookArray = new Book[authorCounter];
        int arrayFillCounter = 0;
        for (int i = 0; i < bookArray.length; i++) {
            if(bookArray[i] == null){
                continue;
            } else if (bookArray[i].getAuthor().equals(author)){
                foundByAuthorBookArray[arrayFillCounter] = bookArray[i];
                arrayFillCounter++;
            }
        }
        return foundByAuthorBookArray;
    }

    @Override
    public Book[] searchByAuthorBeginning(String authorBeginning) {
        int authorCounter = 0;
        for (int i = 0; i < bookArray.length; i++) {
            if(bookArray[i] == null) {
                continue;
            } else if (bookArray[i].getAuthor().contains(authorBeginning)) {
                authorCounter++;
            }
        }
        Book[] foundByAuthorBeginningBookArray = new Book[authorCounter];
        int arrayFillCounter = 0;
        for (int i = 0; i < bookArray.length; i++) {
            if(bookArray[i] == null){
                continue;
            } else if(bookArray[i].getAuthor().contains(authorBeginning)) {
                foundByAuthorBeginningBookArray[arrayFillCounter] = bookArray[i];
                arrayFillCounter++;
            }
        }
        return foundByAuthorBeginningBookArray;
    }

    @Override
    public Book[] searchByTitle(String title) {
        int titleCounter = 0;
        for (int i = 0; i < bookArray.length; i++) {
            if(bookArray[i] == null) {
                continue;
            } else if (bookArray[i].getBookName().equals(title)) {
                titleCounter++;
            }
        }
        Book[] foundByTitleBookArray = new Book[titleCounter];
        int arrayFillCounter = 0;
        for (int i = 0; i < bookArray.length; i++) {
            if(bookArray[i] == null){
                continue;
            } else if (bookArray[i].getBookName().equals(title)){
                foundByTitleBookArray[arrayFillCounter] = bookArray[i];
                arrayFillCounter++;
            }
        }
        return foundByTitleBookArray;
    }

    @Override
    public Book[] searchByTitleBeginning(String titleBeginning) {
        int titleCounter = 0;
        for (int i = 0; i < bookArray.length; i++) {
            if(bookArray[i] == null) {
                continue;
            } else if (bookArray[i].getBookName().contains(titleBeginning)) {
                titleCounter++;
            }
        }
        Book[] foundByTitleBeginningBookArray = new Book[titleCounter];
        int arrayFillCounter = 0;
        for (int i = 0; i < bookArray.length; i++) {
            if(bookArray[i] == null){
                continue;
            } else if(bookArray[i].getBookName().contains(titleBeginning)) {
                foundByTitleBeginningBookArray[arrayFillCounter] = bookArray[i];
                arrayFillCounter++;
            }
        }
        return foundByTitleBeginningBookArray;
    }

    @Override
    public boolean setBookAsRed(Book book) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            if(bookArray[i].equals(book)) {
                bookArray[i].isRed = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setBookAsNotRed(Book book) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                continue;
            }
            if(bookArray[i].equals(book)) {
                bookArray[i].isRed = false;
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] getRedBookList(Book[] book) {
        int redBookCounter = 0;
        for (int i = 0; i < book.length; i++) {
            if(book[i] == null) {
                continue;
            }
            if(book[i].getIsRedStatus() == true){
                redBookCounter++;
            }
        }
        String[] bookList = new String[redBookCounter];
        int arrayFillCounter = 0;
        for (int i = 0; i < book.length; i++) {
            if(book[i] == null){
                continue;
            }
            if(book[i].getIsRedStatus() == true) {
                bookList[arrayFillCounter] = book[i].getBookName() + " [" + book[i].getAuthor() + "]";
                arrayFillCounter++;
            }
        }
        return bookList;
    }

    @Override
    public String[] getNotRedBookList(Book[] book) {
        int NotRedBookCounter = 0;
        for (int i = 0; i < book.length; i++) {
            if(book[i] == null) {
                continue;
            }
            if(book[i].getIsRedStatus() == true){
                NotRedBookCounter++;
            }
        }
        String[] bookList = new String[NotRedBookCounter];
        int arrayFillCounter = 0;
        for (int i = 0; i < book.length; i++) {
            if(book[i] == null){
                continue;
            }
            if(book[i].getIsRedStatus() == false) {
                bookList[arrayFillCounter] = book[i].getBookName() + " [" + book[i].getAuthor() + "]";
                arrayFillCounter++;
            }
        }
        return bookList;
    }

    @Override
    public String toString() {
        return "BookReaderImpl{" +
                "bookArray=" + Arrays.toString(bookArray) +
                '}';
    }
}
