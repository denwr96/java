package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_6;

import java.util.Objects;

//Task_14
//Task_15
//Task_16
//Task_17
//Task_18
//Task_19
//Task_20
//Task_21
//Task_22
//Task_23
//Task_24
//Task_25

public class Book {
    private String title;
    private String author;
    private boolean bookWasRead;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.bookWasRead = false;
    }

    public String getTitle(Book book) {
        return title;
    }

    public String getAuthor(Book book) {
        return author;
    }

    public boolean bookWasReadBecomeTrue() {
        bookWasRead = true;
        return bookWasRead;
    }

    public boolean bookWasReadBecomeFalse() {
        bookWasRead = false;
        return bookWasRead;
    }

    public boolean getWasBookRead() {
        return bookWasRead;
    }
}
