package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_1_intern;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task_1
// Task_2
// Task_5
// Task_11
// Task_12
// Task_13
@CodeReview(approved = true)
class Robot {

    String name;

    Robot() {

    }
    Robot(String robotName){
        this.name = robotName;
    }

    void sayHello() {
        System.out.println("Hello !") ;    // тут напишите команду распечатки на консоли строки "Hello!"
    }

    void sayYourName() {
        System.out.println("My name is " + this.name + " !");   // тут напишите команду распечатки на консоли строки "My name is ROBO"
    }





}
