package javaguru.sunday.student_jelena_lavrenuka.lesson_8.shape;

import javaguru.sunday.teacher.annotations.CodeReview;

// lesson_8 task_16
@CodeReview(approved = true)
class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double areaCircle = Math.PI * (radius * radius);
        return areaCircle;
    }

    @Override
    double calculatePerimeter() {
        double perimeterCircle = 2 * Math.PI * radius;
        return perimeterCircle;
    }
}