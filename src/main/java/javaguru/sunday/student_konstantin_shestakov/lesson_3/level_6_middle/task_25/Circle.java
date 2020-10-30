package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_6_middle.task_25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
class Circle {

    double radius;
    double pi = 3.14159;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {

        System.out.println("Enter circle's radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("Area of cicrle is: " + (pi * (radius*radius)));
        return this.radius;
    }
}


