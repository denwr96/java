package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_5.level_4.task_28;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class Task_28 {
    public static void main(String[] args) {
            int[] arrayLength = new int[8];
            Random random = new Random();

            for (int i = 0; i < arrayLength.length; i++) {
                arrayLength[i] = random.nextInt(100);
            }
            for (int k : arrayLength) {
                System.out.println(k);
            }
            int min = arrayLength[0];
            for (int j : arrayLength) {
                if (j < min) {
                    min = j;
                }
            }
            System.out.println("Max number is: " + min);

    }
}
