package javaguru.sunday.student_natalia_kochkina.lesson_8.level_4;

//Task_19
import javaguru.sunday.teacher.annotations.CodeReview;

import static java.lang.StrictMath.sqrt;

@CodeReview(approved = true)
public class Triangle extends Shape {

    private double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = (sqrt(3) / 4) * (side * side);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = side * 3;
        return perimeter;
    }
}
