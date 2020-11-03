package main.java.javaguru.sunday.student_sergej_savkin.lesson_5.level_2.task_13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class SumOfArray {
    public static void main(String[] args) {
        int[] arrayWithRandomNumbers = new int[3];
        int sumOfNumbers = 0;
        Random random = new Random();

        for (int i = 0; i < arrayWithRandomNumbers.length; i++) {
            arrayWithRandomNumbers[i] = random.nextInt(10);
            System.out.println(arrayWithRandomNumbers[i]);
        }
        for (int i = 0; i < arrayWithRandomNumbers.length; i++) {
            sumOfNumbers += arrayWithRandomNumbers[i];
        }
        System.out.println("Sum is: " + sumOfNumbers);
    }
}
