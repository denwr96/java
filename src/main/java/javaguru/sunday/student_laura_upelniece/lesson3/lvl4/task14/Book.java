package javaguru.sunday.student_laura_upelniece.lesson3.lvl4.task14;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Book {

    String title; // +";"

    Book(String bookTitle) {
        this.title = bookTitle; //newTitle -> bookTitle, +";"
    }

    String getTitle() {
        return this.title;
    }

}
