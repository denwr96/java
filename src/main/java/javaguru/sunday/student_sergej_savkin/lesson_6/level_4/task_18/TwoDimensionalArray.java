package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_4.task_18;

import java.util.Random;

class TwoDimensionalArray {

    public int[][] createArray(int arrayLength) {
        int[] [] array = new int[arrayLength] [arrayLength];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] [] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i] [j] = random.nextInt(10);
            }
        }
    }

    public int calculateSumOfArrayNumbers(int[] [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

}
