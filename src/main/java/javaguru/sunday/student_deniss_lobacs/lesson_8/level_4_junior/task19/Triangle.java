package javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task19;
import javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task15.Shape;
import javaguru.sunday.teacher.annotations.CodeReview;

import static java.lang.Math.sqrt;
@CodeReview(approved = true)
public class Triangle extends Shape {

    private double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (sqrt(3)/4) * (side * side);
    }

    @Override
    public double calculatePerimeter() {
        return side * 3;
    }
}
