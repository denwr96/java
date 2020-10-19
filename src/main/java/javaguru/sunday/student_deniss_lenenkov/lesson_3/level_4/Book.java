package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_3.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Зачем вы пишите кучу новых строк? Отступы страдают. Я вам поправил")
public class Book {

    public String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}

