package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Phone {

    String model;

    Phone(String model) {
        this.model = model;
    }

    String getModel() {
        return this.model;
    }

}