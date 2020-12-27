package javaguru.sunday.student_artjom_proshkin.lesson_8.level_4_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_16
@CodeReview(approved = true)
class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}