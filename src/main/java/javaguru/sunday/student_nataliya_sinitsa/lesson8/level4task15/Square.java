package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level4task15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {

    private double length;

    Square(String title, double length) {
        super(title);
        this.length = length;
    }

    @Override
    double calculateArea() {
        return length * length;
    }

    @Override
    double calculatePerimeter() {
        return 4 * length;
    }

}
