package javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_25;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.5);
        double result = myCircle.calculateArea();
        System.out.println(result);
    }
}
