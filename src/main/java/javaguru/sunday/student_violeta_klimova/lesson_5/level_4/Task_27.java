package main.java.javaguru.sunday.student_violeta_klimova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_27 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOfNumbers = new int[3];


        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arrayOfNumbers));

        int max = arrayOfNumbers[0];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > max) {
                max = arrayOfNumbers[i];
            }
        }
        System.out.println("Max is: " + max);
    }
}