package main.java.javaguru.sunday.student_kristina_sutugina.lesson_8.level_4;
//Task_19
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
