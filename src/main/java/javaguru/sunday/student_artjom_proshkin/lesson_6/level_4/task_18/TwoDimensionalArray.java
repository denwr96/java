package main.java.javaguru.sunday.student_artjom_proshkin.lesson_6.level_4.task_18;


import java.util.Random;

class TwoDimensionalArray {

    int[][] createTwoDimArray(int arrayLength) {
        int[][] myTwoDimArray = new int[arrayLength][arrayLength];
        return myTwoDimArray;
    }

    void fillArrayWithRandomNumbers(int[][]myTwoDimArray) {
        Random random = new Random();
        for (int i = 0; i < myTwoDimArray.length; i++) {
            for (int j = 0; j < myTwoDimArray.length; j++) {
                myTwoDimArray [i] [j] = random.nextInt(10);
            }
        }
    }

    int calculateSumOfTwoDimArray (int[][] myTwoDimArray){
        int sum = 0;
        for (int i = 0; i < myTwoDimArray.length; i++) {
            for (int j = 0; j < myTwoDimArray.length; j++) {
                sum += myTwoDimArray[i][j];
            }
        }
        return sum;
    }
}
