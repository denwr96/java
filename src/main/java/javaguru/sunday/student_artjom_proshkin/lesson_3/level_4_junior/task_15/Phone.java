package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_4_junior.task_15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

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
