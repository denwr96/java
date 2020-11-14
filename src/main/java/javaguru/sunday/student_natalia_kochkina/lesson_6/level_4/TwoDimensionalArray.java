package main.java.javaguru.sunday.student_natalia_kochkina.lesson_6.level_4;

//Task_18

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class TwoDimensionalArray {

    public int[][] createArrayWithRandomNumbers(){
        int[][] twoDimensionalArray = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                twoDimensionalArray[i][j] = random.nextInt();
                System.out.println(twoDimensionalArray[i][j]);
            }
        }
        return twoDimensionalArray;
    }

    public int sumOfAllNumbers(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }
}
