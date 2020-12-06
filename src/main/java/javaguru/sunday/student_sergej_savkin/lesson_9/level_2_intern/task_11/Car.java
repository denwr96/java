package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_2_intern.task_11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Car {

    String color;

    protected Car(String color) {
        this.color = color;
        System.out.println("Parent constructor");
    }
}

class SuperCar extends Car {

    SuperCar() {
        super("black");
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new SuperCar();
    }
}
