package main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_4;

//Task_17

public class Square extends Shape {

    private double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = side * side;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = side * 4;
        return perimeter;
    }
}
