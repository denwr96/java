package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_6_middle.task_25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Было бы лучше, возвращать значение площади из метода, а не выводить его на консоль.")
class Circle {

    double radius;

    Circle (double radius){
        this.radius = radius;
    }

    double calculateArea(){
        double circleArea = Math.PI * radius * radius;
        System.out.println("Circle area is " + circleArea);
        return circleArea;
    }
}
