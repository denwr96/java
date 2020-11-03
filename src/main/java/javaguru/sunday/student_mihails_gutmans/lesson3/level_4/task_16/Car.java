package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_4.task_16;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Car {

    private String model;

    Car(String enterModel) {
        this.model = enterModel;
    }

    String getModel() {
        return this.model;
    }
}
