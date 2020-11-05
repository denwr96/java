package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_6.level_4;

// Task 18

import java.util.Arrays;

class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.arraySumTest();
    }

    TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
    int[][] arrayOne = twoDimensionalArray.createArray(2,2);

    public void arraySumTest() {
        System.out.println(Arrays.deepToString(arrayOne));
        System.out.println("Sum = " + twoDimensionalArray.arraySum(arrayOne));
        int sum = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                sum = sum + arrayOne[i][j];
            }
        }
        System.out.println("Sum (expected value) = " + sum);
        checkResults(twoDimensionalArray.arraySum(arrayOne) == sum, "2D Array Sum of elements TEST");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }
}
