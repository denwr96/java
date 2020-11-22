package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_8.task_15_to_19;

public class Triangle extends Shape {
    private double sideLength;


    Triangle(double sideLength) {
        super("Triangle");
        this.sideLength = sideLength;
    }
    double calculateArea() {
        double areaTriangle = (Math.sqrt(3) * (sideLength * sideLength)) / 4;
        return areaTriangle;
    }
    double calculatePerimeter() {
        double perimeterTriangle = 3 * sideLength;
        return perimeterTriangle;
    }
}
