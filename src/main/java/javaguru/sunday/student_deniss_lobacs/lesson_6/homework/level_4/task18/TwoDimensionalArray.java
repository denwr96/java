package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_4.task18;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class TwoDimensionalArray {

    public static void fillArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }

    public static int sumOfTwoDimensionalArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println("Sum = " + sum);
        return sum;
    }
}
