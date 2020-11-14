package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_6.level_4;

// Task 18

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class TwoDimensionalArray {

    Random random = new Random();

    public int[][] createArray(int arrayLength1, int arrayLength2) {
        int[][] arrayOne = new int[arrayLength1][arrayLength2];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayOne[i][j] = random.nextInt(10);
            }
        }
        return arrayOne;
    }

    int arraySum(int[][] arrayOne) {
        int sum = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                sum = sum + arrayOne[i][j];
            }
        }
        return sum;
    }
}
