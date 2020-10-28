package main.java.javaguru.sunday.student_sergej_savkin.lesson_5.level_2.task_12;

import java.util.Random;

class Array3 {
    public static void main(String[] args) {
        int[] arrayWithRandomNumbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < arrayWithRandomNumbers.length; i++) {
            arrayWithRandomNumbers[i] = random.nextInt(20);
        }
        for (int i = 0; i < arrayWithRandomNumbers.length; i++) {
            System.out.println(arrayWithRandomNumbers[i]);
        }
    }
}
