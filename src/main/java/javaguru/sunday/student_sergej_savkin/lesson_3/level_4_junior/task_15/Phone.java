package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_4_junior.task_15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Очень сложно читать ваш класс. У вас совсем уехал формат. Надо исправить")
class Phone {

    String model;

    Phone(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }
}