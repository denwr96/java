package javaguru.sunday.student_kristina_sutugina.lesson_3.level_4;

//Task_14

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Book {

    String title;

    Book(String bookTitle) {

        this.title = bookTitle;
    }

    String getTitle() {

        return this.title;
    }
}
