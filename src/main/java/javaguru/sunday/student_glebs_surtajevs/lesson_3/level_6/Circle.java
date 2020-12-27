package javaguru.sunday.student_glebs_surtajevs.lesson_3.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Circle {

    double radius;
    double pi;

    Circle(double radius, double pi) {

        this.radius = radius;
        this.pi = pi;
    }

    void area() {
        double result = pi * radius * radius;
        System.out.println("Area of a circle is = " + result);
    }
}
