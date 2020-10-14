package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_1.task_11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "У вас очень сильно поехал формат. Внимательно посмотрите на классы, которые мы делали в ходе урока. Где там скобки, где все отступы." +
        "Так же переменные, мы называем с маленькой буквы. Надо поправить.")
public class Divide {

    public static void main(String[] args) {
        int numberOne = 50;
        int numberTwo = 3;
        int divide = numberOne / numberTwo;

    System.out.println(divide);
    }

}
