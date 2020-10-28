package main.java.javaguru.sunday.student_sergej_savkin.lesson_5.level_2.task_14;

import java.util.Random;

class AverageOfNumbers {
    public static void main(String[] args) {
        int[] arrayOfRandomNumbers = new int[3];
        double sumOfNumbers = 0;
        Random random = new Random();

        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = random.nextInt(10);
            System.out.println(arrayOfRandomNumbers[i]);
            sumOfNumbers += arrayOfRandomNumbers[i];
        }
        System.out.println("Summ of numbers is: " + sumOfNumbers);
        System.out.println("Average of numbers is " + sumOfNumbers/ arrayOfRandomNumbers.length);
    }
}
