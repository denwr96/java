package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_6.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BrakeWhile {

    public static void main(String[] args) {

        int i = 0;
        while (i < 1) {
            System.out.println(i);
            break;
        }
    }
}