package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_4;
//task11
//task12
//task13

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Robot {
    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
};


