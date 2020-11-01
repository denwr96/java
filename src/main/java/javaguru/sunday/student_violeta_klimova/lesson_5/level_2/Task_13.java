package main.java.javaguru.sunday.student_violeta_klimova.lesson_5.level_2;

import java.util.Random;

class Task_13 {

    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[3];
        Random random = new Random();

        int sum = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(100);
            System.out.println("New random number: " + arrayOfNumbers[i]);
            sum = sum + arrayOfNumbers[i];
        }
        System.out.println("Sum: " + sum);
    }
}