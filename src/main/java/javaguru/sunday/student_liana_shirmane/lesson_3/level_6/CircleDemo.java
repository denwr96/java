package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(7.85);
        myCircle.calculateArea();

        Circle myOtherCircle = new Circle(2.76755);
        myOtherCircle.calculateArea();
    }
}
