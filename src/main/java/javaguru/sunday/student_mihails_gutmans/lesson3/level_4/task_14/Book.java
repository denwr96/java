package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_4.task_14;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Book {

    String bookTitle;

    Book(String myBookTitle) {
        this.bookTitle = myBookTitle;
    }

    String getTitle() {
        return this.bookTitle;
    }
}
