package main.java.javaguru.sunday.student_laura_upelniece.lesson3.lvl6.task25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Лучше не выводить каждое действие в консоль. Это лишний код, который перед коммитом лучше удалить.")
class Circle {
    double radius;

    public Circle(double circleRadius) {
        this.radius = circleRadius;
        System.out.println("Circle radius: " + radius);
    }

    public void calculateArea() {
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("Circle area: " + area);
    }




}
