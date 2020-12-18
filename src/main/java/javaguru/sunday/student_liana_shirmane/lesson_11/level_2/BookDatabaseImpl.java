package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_2;
//task6

import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    List<Book> bookDatabase;

    public BookDatabaseImpl(List<Book> bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    long counter = 1;

    @Override
    public Long save(Book book) {
        book.setId(counter);
        counter++;
        bookDatabase.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < bookDatabase.size(); i++) {
            if (bookDatabase.equals(bookId)) {
                bookDatabase.remove(bookId);
                return true;
            }

        } return false;
    }

    public void printBookList() {
        for (Book book : bookDatabase) {
            System.out.println(book.toString());
        }
    }
}

