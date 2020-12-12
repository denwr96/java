package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_1;
//task5

public class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String toString() {
        return "Book [" +
                "Title:'" + title + '\'' +
                ", Author:'" + author + '\'' +
                ']';
    }

}