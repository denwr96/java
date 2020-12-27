package javaguru.sunday.student_kristina_sutugina.lesson_8.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_18
@CodeReview(approved = true)
public class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        double area = length * width;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = (2 * length) + (2 * width);
        return perimeter;
    }
}