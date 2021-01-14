package javaguru.sunday.student_liana_shirmane.lesson_8.level_4_5;
//task17

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {
    private double side;

    Square(double side){
        super("Square");
        this.side = side;
    }

    @Override
    double calculateArea() {
        double areaSquare = side*side;
        return areaSquare;
    }

    @Override
    double calculatePerimeter() {
        double perimeterSquare = 4*side;
        return perimeterSquare;
    }
}
