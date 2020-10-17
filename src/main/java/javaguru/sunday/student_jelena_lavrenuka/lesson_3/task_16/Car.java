package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_16;

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
