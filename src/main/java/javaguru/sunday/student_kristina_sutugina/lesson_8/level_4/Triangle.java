package javaguru.sunday.student_kristina_sutugina.lesson_8.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_19
@CodeReview(approved = true)
public class Triangle extends Shape {
    private double length;

    Triangle(double length) {
        super("Triangle");
        this.length = length;
    }

    @Override
    double calculateArea() {
        double area = ((length * length) * Math.sqrt(3)) / 4;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 3 * length;
        return perimeter;
    }
}
