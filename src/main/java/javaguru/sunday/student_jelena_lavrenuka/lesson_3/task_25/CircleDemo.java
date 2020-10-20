package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Вы запускали программу? Результат странный =) Оно не работает как надо.")
class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.5);
        double result = myCircle.calculateArea();
        System.out.println(result);
    }
}
