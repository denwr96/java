package javaguru.sunday.student_emin_pjatnickis.lesson_3.homework.level_4;

// level_4

import javaguru.sunday.teacher.annotations.CodeReview;

// Task_16
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
