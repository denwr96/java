package javaguru.sunday.student_sergej_savkin.lesson_11.level_1_intern.task_2;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Book {
    String bookName;
    String author;
    int pageAmount;

    public Book(String bookName, String author, int pageAmount) {
        this.bookName = bookName;
        this.author = author;
        this.pageAmount = pageAmount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", pageAmount=" + pageAmount +
                '}';
    }
}
