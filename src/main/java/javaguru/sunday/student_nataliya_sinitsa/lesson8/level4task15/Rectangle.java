package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level4task15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Rectangle extends Shape {

    private double length;
    private double height;

    Rectangle(String title, double length, double height) {
        super(title);
        this.length = length;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return length * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + height);
    }

}
