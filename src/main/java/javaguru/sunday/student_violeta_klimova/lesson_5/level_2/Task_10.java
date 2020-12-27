package javaguru.sunday.student_violeta_klimova.lesson_5.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task_10 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt();

            System.out.println(number[i]);
        }
    }
}