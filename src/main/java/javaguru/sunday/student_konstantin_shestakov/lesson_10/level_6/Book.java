package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Objects;

// Task 14 - 25
@CodeReview(approved = true)
class Book {

    private String title;
    private String author;
    private boolean bookIsRead;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title) {
        this.title = title;
    }

    Book() {
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

    public boolean getBookIsRead() {
        return bookIsRead;
    }

    public void setBookIsRead(boolean bookIsRead) {
        this.bookIsRead = bookIsRead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookIsRead='" + bookIsRead + '\'' +
                '}';
    }
}
