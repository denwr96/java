package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_6_middle;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task30
@CodeReview(approved = true)
public class Varags {
    public static void main(String[] args) {
        Varags varags = new Varags();
        varags.test(1, 10, 22, -5, 40, 10, 1, 0, -100, 80);
    }

    public void test(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += 1;
        }
        System.out.println("Sum = " + sum);
    }
}
