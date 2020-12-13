package main.java.javaguru.sunday.student_liana_shirmane.lesson_8.level_4_5;
//task19
import static java.lang.Math.sqrt;

class Triangle extends Shape {

    private double side;

    Triangle(double side) {
        super("Triangle");
        this.side = side;
    }

    @Override
    double calculateArea() {
        double areaTriangle = (side * side * sqrt(3)) / 4;
        return areaTriangle;
    }

    @Override
    double calculatePerimeter() {
        double perimeterTriangle = side * 3;
        return perimeterTriangle;
    }
}
