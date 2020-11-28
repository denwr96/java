package main.java.javaguru.sunday.student_artjom_proshkin.lesson_8.level_4_junior;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_18
@CodeReview(approved = true)
class Rectangle extends Shape {

    private double firstEdge;
    private double secondEdge;

    Rectangle(String title, double firstEdge, double secondEdge) {
        super(title);
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
    }

    @Override
    double calculateArea() {
        return firstEdge * secondEdge;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (firstEdge + secondEdge);
    }
}
