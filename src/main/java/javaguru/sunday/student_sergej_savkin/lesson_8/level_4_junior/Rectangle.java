package main.java.javaguru.sunday.student_sergej_savkin.lesson_8.level_4_junior;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task_18
@CodeReview(approved = true)
class Rectangle extends Shape {

    private double sideOne;
    private double sideTwo;

    Rectangle(String title, double sideOne, double sideTwo) {
        super(title);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    double calculateArea() {
        return sideOne * sideTwo;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (sideOne + sideTwo);
    }
}
