package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_3_junior.task12;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Robot {

    String name;

    public Robot() {
    }

    public Robot(String robotName) {
        this.name = robotName;
    }


    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayYourName() {
        System.out.println("My name is ROBO");
    }


}