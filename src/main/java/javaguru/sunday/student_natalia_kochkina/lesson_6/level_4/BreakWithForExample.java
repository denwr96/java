package main.java.javaguru.sunday.student_natalia_kochkina.lesson_6.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BreakWithForExample {

    public static void main(String[] args) {
        for (int i = 1; i > 0; i++) {
            System.out.println(i);
            if (i == 66) {
                break;
            }
        }
    }
}

