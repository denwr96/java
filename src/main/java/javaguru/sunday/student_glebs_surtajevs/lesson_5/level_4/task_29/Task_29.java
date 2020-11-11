package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_5.level_4.task_29;

import java.util.Random;

public class Task_29 {
    public static void main(String[] args) {
        int[] arrayLength = new int[9];
        Random random = new Random();

        for (int i = 0; i < arrayLength.length; i++) {
            arrayLength[i] = random.nextInt(100);
        }
        for (int k : arrayLength) {
            System.out.println(k);
        }
        int evenNumber = arrayLength[0];
        for (int j : arrayLength) {
            if (j % 2 == 0) {
                evenNumber = j;
            }
        }
        System.out.println("Even number is: " + evenNumber);

    }
}
