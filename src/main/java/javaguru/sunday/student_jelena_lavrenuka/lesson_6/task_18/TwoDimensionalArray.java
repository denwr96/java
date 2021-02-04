package javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_18;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class TwoDimensionalArray {
    public int[][] twoDimensionalArrayCreate (int arrayLengthOne, int arrayLengthTwo){
        int [][] myArray = new int [arrayLengthOne][arrayLengthTwo];
        return myArray;

    }

    public void fillTwoDimensionalArrayWithRandomNumbers (int[][] myArray){
        Random myRandom = new Random();
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                myArray[i][j] = myRandom.nextInt(100);
            }
        }
    }

    public int sumTwoDimensionalArray (int[][] myArray){
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                sum += myArray[i][j];
            }
        }return sum;
    }
}

