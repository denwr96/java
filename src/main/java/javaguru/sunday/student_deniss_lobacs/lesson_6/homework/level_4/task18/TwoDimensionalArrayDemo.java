package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_4.task18;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] myArray = new int[3][3];
        TwoDimensionalArray.fillArrayWithRandomNumbers(myArray);

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        TwoDimensionalArray.sumOfTwoDimensionalArray(myArray);
    }
}
