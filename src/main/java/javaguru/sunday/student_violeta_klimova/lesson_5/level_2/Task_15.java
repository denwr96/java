package main.java.javaguru.sunday.student_violeta_klimova.lesson_5.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task_15 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(100);
            System.out.println("New random number: " + arrayOfNumbers[i]);
        }
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = arrayOfNumbers[i] + 2;
//            arrayOfNumbers[i] += 2;
            System.out.println(arrayOfNumbers[i]);
        }
    }
}