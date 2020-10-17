package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_4_junior.task_14;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

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
