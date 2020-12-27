package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task14
//task15
//task16
//task17
//task18
//task19
//task20
//task21
//task22
//task23
//task24
//task25
@CodeReview(approved = true)
public class Book {

    public boolean isRead;
    private String title;
    private String author;

    public Book (String title, String author, boolean isRead) {
        this.title = title;
        this.author = author;
        this.isRead = isRead;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return "Book {" +
                "Title ='" + title + '\'' +
                ", Author ='" + author + '\'' +
                '}';
    }

    public boolean isMarkAsRead() {
        return isRead;
    }

    public void setMarkAsRead(boolean markAsRead) {
        this.isRead = markAsRead;
    }
}
