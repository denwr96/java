package main.java.javaguru.sunday.student_artjom_proshkin.lesson_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Будет лучше, если вы сразу привыкните писать понятные названия переменных")
public class Task_11 {
    public static void main(String[] args) {
        int x = 74;
        int y = 36;
        int z = x + y;
        System.out.println(z);


        int x1 = 50;
        int y1 = 3;
        int z1 = x1 / y1;
        System.out.println(z1);
    }
}