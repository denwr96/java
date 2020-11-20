package main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_4;

//Task_18

public class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(String title, double length, double width) {
        super(title);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area = length * width;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = (length + width) * 2;
        return perimeter;
    }
}
