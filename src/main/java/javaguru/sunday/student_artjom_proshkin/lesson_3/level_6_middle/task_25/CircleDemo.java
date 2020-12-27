package javaguru.sunday.student_artjom_proshkin.lesson_3.level_6_middle.task_25;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "А чего вы не возвращаете значение из метода calculateArea?")
class CircleDemo {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(7.5);
        firstCircle.calculateArea();
    }
}
