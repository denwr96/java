package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_4.task18;

import java.util.Arrays;

public class  TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.shouldSumElementsOfArraysTest();
        test.shouldSumElementsOfArraysFailedTest();
    }

    public void shouldSumElementsOfArraysTest() {
        int[][] myArray = {{3,1,3},{3,3,3}};
        int expectedResult = 16;
        int actualResult = TwoDimensionalArray.sumOfTwoDimensionalArray(myArray);
        check(expectedResult , actualResult , "Test");
    }

    public void shouldSumElementsOfArraysFailedTest() {
        int[][] myArray = {{3,1,3},{3,3,3}};
        int expectedResult = 26;
        int actualResult = TwoDimensionalArray.sumOfTwoDimensionalArray(myArray);
        check(expectedResult , actualResult , "Test");
    }
    public void check(int expectedResult , int actualResult , String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }

}
