package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_4_junior.task_16;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Car {

    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}
