package main.java.javaguru.sunday.student_violeta_klimova.lesson_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Все хорошо, только переменные плохо названы")
public class Lesson_1_task_11 {
    public static void main(String[] args) {
        int a = 74;
        int b = 36;

        System.out.println (a+b);

        // к сожалению,не знаю стилистику написания двух заданий в одном классе

        int c = 50;
        int d = 3;

        System.out.println(c/d);
    }
}
