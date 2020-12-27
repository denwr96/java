package javaguru.sunday.student_sergej_savkin.lesson_3.level_2_intern.task_8;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StringConcatenate {
    public static void main(String[] args) {
        String userName = "Sergej";
        String greeting = "Hi " + userName + "!";

        System.out.println(greeting);
    }
}
