package main.java.javaguru.sunday.student_artjom_proshkin.lesson_1.task_11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Будет лучше, если вы сразу привыкните писать понятные названия переменных")
// исправил названия переменных 7.10.20
public class Task_11 {
    public static void main(String[] args) {
        int numberOne = 74;
        int numberTwo = 36;
        int sum = numberOne + numberTwo;
        System.out.println(sum);


        int numberThree = 50;
        int numberFour = 3;
        int divide = numberThree / numberFour;
        System.out.println(divide);
    }
}