package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task19;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {

    private double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (sqrt(3)/4) * (side * side);
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }
}
