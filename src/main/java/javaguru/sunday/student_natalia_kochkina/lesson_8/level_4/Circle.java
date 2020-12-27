package javaguru.sunday.student_natalia_kochkina.lesson_8.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_16
@CodeReview(approved = true)
public class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = 3.14 * (radius * radius);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }
}
