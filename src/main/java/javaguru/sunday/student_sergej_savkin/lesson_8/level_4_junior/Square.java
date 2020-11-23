package main.java.javaguru.sunday.student_sergej_savkin.lesson_8.level_4_junior;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task_17
@CodeReview(approved = true)
class Square extends Shape {

    private double side;

    Square(String title, double side){
        super(title);
        this.side = side;
    }


    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }
}
