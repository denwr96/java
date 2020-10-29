package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_3.task_18_22;
/// Task_18
/// Task_19
/// Task_20
/// Task21
/// Task22

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog(" Loulou ", 1, "White");
        myDog.voice1();
        myDog.voice2();
        myDog.Birthday();
        myDog.voice3();
        myDog.voice4();
        myDog.changeColor(" Black ");
        myDog.voice4();
        myDog.changeColor(" Pink ");


    }
}
