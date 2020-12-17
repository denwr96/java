package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_2;
//task6


import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> bookList = new ArrayList<>();

    @Override
    public Long save(Book book) {
        bookList.add(book);
        return book.getId();
    }
}
