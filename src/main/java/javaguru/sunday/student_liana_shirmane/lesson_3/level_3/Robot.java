package javaguru.sunday.student_liana_shirmane.lesson_3.level_3;
//task11
//task12
//task13

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Robot {
    String name;

    Robot(String robotName) {
        this.name = robotName;
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
};


