package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_5_middle.task_18;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {
    String dogName;

    Dog(String dogName) {
        this.dogName = dogName;
    }

    void voice() {
        for (int i = 0; i < 3; i++) {
            System.out.println(dogName);
        }

    }
}
