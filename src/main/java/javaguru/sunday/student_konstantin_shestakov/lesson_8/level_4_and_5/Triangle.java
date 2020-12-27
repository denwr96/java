package javaguru.sunday.student_konstantin_shestakov.lesson_8.level_4_and_5;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 19
@CodeReview(approved = true)
public class Triangle extends Shape {

    private double side; // треугольник равносторонний

    Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        System.out.println("Equilateral triangle side = " + side + ", area = " + (Math.sqrt(3) * side * side / 4));
        return Math.sqrt(3) * side * side / 4;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Equilateral triangle side = " + side + ", perimeter = " + (3 * side));
        return 3 * side;
    }
}
