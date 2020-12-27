package javaguru.sunday.student_sergej_savkin.lesson_10.level_6_middle.task_14_25;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Objects;

@CodeReview(approved = true)
class Book {

    String bookName;
    String author;
    boolean isRed = false;

    Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsRedStatus() {
        return isRed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
