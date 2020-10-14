package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_4_junior.task_14;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Прпавил вам формат чуть-чуть. В методах можно не пропускать первую строчку. Это раздувает запись...труднее читать")
class Book {

    String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }
}
