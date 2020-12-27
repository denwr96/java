package javaguru.sunday.student_anna_aleksejeva.lesson_8.task_15_to_19;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Square extends Shape {
    private double sideWide;

    Square(double radius) {
        super("Square");
        this.sideWide = sideWide;
    }

    double calculateArea() {
        double areaSquare = sideWide * sideWide;
        return areaSquare;
    }

    double calculatePerimeter() {
        double perimeterSquare = (sideWide * 4);
        return perimeterSquare;
    }
}
