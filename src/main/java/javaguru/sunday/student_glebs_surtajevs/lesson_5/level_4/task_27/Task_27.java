package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_5.level_4.task_27;

import java.util.Random;

public class Task_27 {
    public static void main(String[] args) {
        int[] arrayLength = new int[8];
        Random random = new Random();

        for (int i = 0; i < arrayLength.length; i++) {
            arrayLength[i] = random.nextInt(100);
        }
        for (int k : arrayLength) {
            System.out.println(k);
        }
        int max = arrayLength[0];
        for (int j : arrayLength) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Max number is: " + max);

    }
}
