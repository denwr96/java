package javaguru.sunday.student_glebs_surtajevs.lesson_3.level_3;

//Task_11
//Task_12
//Task_13

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Robot {
    String name;
    Robot(String robotName) {
        this.name = robotName; }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    void sayHello() {
        System.out.println("Hello " + this.name);
    }
}
