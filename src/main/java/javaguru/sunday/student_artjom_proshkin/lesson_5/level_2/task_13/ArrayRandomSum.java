package main.java.javaguru.sunday.student_artjom_proshkin.lesson_5.level_2.task_13;

import java.util.Random;

class ArrayRandomSum {

    public static void main(String[] args) {

        int[] arraySum = new int[3];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < arraySum.length; i++) {
            arraySum[i] = random.nextInt(20);
            sum = sum + arraySum[i];
        }

        for (int i = 0; i < arraySum.length; i++) {
            System.out.println("i = " + i + "; Number = " + arraySum[i]);
        }
        System.out.println("Sum of i = " + sum);
    }
}
