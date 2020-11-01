package main.java.javaguru.sunday.student_violeta_klimova.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_12 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(arrayOfNumbers));
    }
}