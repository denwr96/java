package main.java.javaguru.sunday.student_kristina_sutugina.lesson_6.level_4;
//Task_18
import java.util.Random;

class TwoDimensionalArray {
    public int[][] createArray(int arrayLengthOne, int arrayLengthTwo) {
        int[][] twoDimArray = new int[arrayLengthOne][arrayLengthTwo];
        return twoDimArray;
    }

    public void fillRandomNumbers(int[][] array) {
        Random randomNumbers = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumbers.nextInt(100);
            }
        }
    }

    public int sumOfNumbers(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
        return sum;
    }
}
