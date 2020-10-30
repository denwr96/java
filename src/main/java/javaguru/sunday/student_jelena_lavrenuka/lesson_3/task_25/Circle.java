package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        double area = (Math.PI * Math.pow(2, radius));
        return area;
    }
}
