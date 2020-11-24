package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_8.shape;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// lesson_8 task_17
@CodeReview(approved = true)
class Square extends Shape{
    private double sideLength;

    Square(double sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        double areaSquare = sideLength * sideLength;
        return areaSquare;
    }

    @Override
    double calculatePerimeter() {
        double perimeterSquare = sideLength * 4;
        return perimeterSquare;
    }
}
