package main.java.javaguru.sunday.student_kristina_sutugina.lesson_3.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_15
@CodeReview(approved = true)
class Phone {
    String model;

    Phone(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }
}
