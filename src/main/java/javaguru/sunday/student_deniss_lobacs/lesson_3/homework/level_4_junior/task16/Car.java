package main.java.javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_4_junior.task16;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Car {
    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }
}
