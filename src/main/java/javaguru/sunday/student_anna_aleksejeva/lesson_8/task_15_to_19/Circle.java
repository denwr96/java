package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_8.task_15_to_19;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double calculateArea() {
        double areaCircle = (radius * radius) * Math.PI;
        return areaCircle;
    }

    double calculatePerimeter() {
        double perimeterCircle = (radius * Math.PI * 2);
        return perimeterCircle;
    }
}

