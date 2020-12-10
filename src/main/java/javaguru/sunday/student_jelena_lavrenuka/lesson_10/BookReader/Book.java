package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.BookReader;

import java.util.Objects;

class Book {
    private String bookTitle;
    private String bookAuthor;
    private boolean markAsRead;

    public Book(String bookTitle, String bookAuthor, boolean markAsRead) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.markAsRead = markAsRead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) &&
                bookAuthor.equals(book.bookAuthor);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
    public boolean isMarkAsRead() {
        return markAsRead;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setMarkAsRead(boolean markAsRead) {
        this.markAsRead = markAsRead;
    }
}
