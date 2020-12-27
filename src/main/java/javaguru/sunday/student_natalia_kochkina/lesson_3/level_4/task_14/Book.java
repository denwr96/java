package javaguru.sunday.student_natalia_kochkina.lesson_3.level_4.task_14;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task14
@CodeReview(approved = true)
class Book {

    String title;

    Book(String bookTitle) { //конструктор класса
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}
