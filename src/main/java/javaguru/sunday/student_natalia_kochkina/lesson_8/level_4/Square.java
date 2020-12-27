package javaguru.sunday.student_natalia_kochkina.lesson_8.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_17
@CodeReview(approved = true)
public class Square extends Shape {

    private double side;

    public Square(String title, double side) {
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
