package main.java.javaguru.sunday.student_sergej_savkin.lesson_8.level_4_junior;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task_16
@CodeReview(approved = true)
class Circle extends Shape {

    private double radius;
    private final double pi = 3.14159;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    @Override
    double calculateArea() {
        return pi * (radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return 2 * radius * pi;
    }

}
