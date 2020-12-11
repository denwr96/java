package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_6;
//task14
//task15
//task16
//task17

import java.util.ArrayList;

class BookReaderImpl implements BookReader {

    ArrayList<Book> bookList = new ArrayList();

    @Override
    public boolean checkIfBookExistInList(Book book) {
        for (Book value : bookList) {
            if (value.getTitle().equals(book.getTitle()) &&
                    value.getAuthor().equals(book.getAuthor())) {
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean checkBookTitle(Book book) {
        if (book.getTitle().equals("")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean checkBookAuthor(Book book) {
        if (book.getAuthor().equals("")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean add(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            if (checkIfBookExistInList(book) || checkBookTitle(book) || checkBookAuthor(book)) {
                System.out.println("Book is already in the list or title/author is missing");
                return false;
            }

        }
        bookList.add(book);
        return true;

    }

    @Override
    public boolean remove(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            if (!checkIfBookExistInList(book)) {
                System.out.println("Book is not in the list");
                return false;
            }

        }
        bookList.remove(book);
        return true;

    }

    @Override
    public void printBookList() {
        for (Book book: bookList) {
            System.out.println(book);
        }
    }
}
