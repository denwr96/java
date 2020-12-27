package javaguru.sunday.student_violeta_klimova.lesson_5.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task_14 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[3];
        Random random = new Random();

        double sum = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(100);
            System.out.println("New random number: " + arrayOfNumbers[i]);
            sum = sum + arrayOfNumbers[i];
        }

        double avg = sum / arrayOfNumbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}