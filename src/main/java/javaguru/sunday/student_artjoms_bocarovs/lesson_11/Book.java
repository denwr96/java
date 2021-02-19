package javaguru.sunday.student_artjoms_bocarovs.lesson_11;

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
