package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task19;
import main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task15.Shape;
import static java.lang.Math.sqrt;

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
