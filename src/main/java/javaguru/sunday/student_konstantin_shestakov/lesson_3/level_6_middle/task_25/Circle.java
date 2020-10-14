package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_6_middle.task_25;

import java.util.Scanner;

class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

        double calculateArea() {
            double pi = 3.14159;
            System.out.println("Enter circle's radius: ");
            Scanner scanner = new Scanner(System.in);
            double radius = scanner.nextDouble();
            System.out.println("Area of cicrle is: " + (pi * (radius*radius)));
            return this.radius;
        }



}


