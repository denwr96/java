package main.java.javaguru.sunday.teacher.lesson_10.lessoncode.library;

import java.util.Objects;

public class Book {

    private String name;
    private String author;
    private boolean isReserved;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.isReserved = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isReserved == book.isReserved &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isReserved=" + isReserved +
                '}';
    }
}
