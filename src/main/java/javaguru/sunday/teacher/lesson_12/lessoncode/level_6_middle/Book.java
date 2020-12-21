package main.java.javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle;

import java.util.Objects;

// task14, task15, task16, task17, task18, task19, task20, task21, task22, task23, task24, task25;

public class Book {

    private String title;
    private String author;

    private boolean isRead;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isRead = isRead;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return title + " [" + author + "]";
    }
}
