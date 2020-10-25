package main.java.javaguru.sunday.student_emin_pjatnickis.lesson_3.homework.level_4;

// level_4

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task_15
@CodeReview(approved = true)
public class Phone {

    String model;

    Phone (String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }
}

