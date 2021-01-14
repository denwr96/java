package javaguru.sunday.student_artjom_proshkin.lesson_10.level_6_middle;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Objects;

@CodeReview(approved = true)
class Book {

    String bookAuthor;
    String bookTitle;
    boolean alreadyRead = false;

    Book(String bookAuthor, String bookTitle) {
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public boolean isAlreadyRead() {
        return alreadyRead;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookAuthor, book.bookAuthor) &&
                Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookAuthor, bookTitle);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookAuthor='" + bookAuthor + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
