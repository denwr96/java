package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson6.level4.task18;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class TwoDimensionalArray {

    public int[][] createArray(int arrayLength, int arrayWidth) {
        return new int[arrayLength][arrayWidth];
    }

    public void fillArrayWithRandomNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random random = new Random();
                array[i][j] = random.nextInt();
            }
        }
    }

    public int sumOfArrayNumbers(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum = sum + anInt;
            }
        }
        return sum;
    }

}
