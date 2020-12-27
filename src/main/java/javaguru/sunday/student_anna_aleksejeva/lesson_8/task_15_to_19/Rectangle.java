package javaguru.sunday.student_anna_aleksejeva.lesson_8.task_15_to_19;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Rectangle extends Shape {
    private double rectangleLength;
    private double rectangleHeigth;

    Rectangle(double rectangleLength, double rectangleHeigth) {
        super("Rectangle");
        this.rectangleLength = rectangleLength;
        this.rectangleHeigth = rectangleHeigth;
    }
    double calculateArea() {
        double areaRectangle = (rectangleLength * rectangleHeigth);
        return areaRectangle;
    }
    double calculatePerimeter() {
        double perimeterRectangle = 2 * (rectangleLength + rectangleHeigth);
        return perimeterRectangle;
    }
}
