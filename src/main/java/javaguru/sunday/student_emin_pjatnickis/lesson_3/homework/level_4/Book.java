package main.java.javaguru.sunday.student_emin_pjatnickis.lesson_3.homework.level_4;

// level_4

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task_14
@CodeReview(approved = true)
public class Book {

    String title;

    Book(String newTitle) {
        this.title = newTitle;
    }

    String getTitle() {
        return this.title;
    }

}
