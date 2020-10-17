package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task 1 --> Task 6 + Task 11 --> Task 13 (level 3)
@CodeReview(approved = true)
class Robot {

    public String name;

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        // System.out.println("My name is ROBO");
        System.out.println("My name is " + this.name);
    }

    public Robot () {
        this.name = "ROBO";
    }

    public Robot (String robotName) {
        this.name = robotName;

    }
}
