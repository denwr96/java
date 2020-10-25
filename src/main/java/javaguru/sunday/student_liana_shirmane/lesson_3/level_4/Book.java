package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Book {

    String bookTitle;

    Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    String getTitle() {
        return this.bookTitle;
    }

}
