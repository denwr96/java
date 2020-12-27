package javaguru.sunday.student_sergej_savkin.lesson_8.level_4_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

//task_19
@CodeReview(approved = true)
class Triangle extends Shape {

    private double side;
    private final double squareFromThree = 1.732;

    Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (squareFromThree * (side * side)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }
}
