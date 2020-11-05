package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_3.task_9_10_11_12_13_14;


import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.containsNumberShouldReturnTrueTest(2);
        arrayUtilTest.containsNumberShouldReturnFalseTest(4);
        arrayUtilTest.containsNumberTimesShouldReturnZeroTest(0);
        arrayUtilTest.containsNumberTimesShouldReturnNumberTest(5);
        arrayUtilTest.replaceFirstNumberTest();
        arrayUtilTest.replaceAllMatchesTest();
        arrayUtilTest.reverseArrayTest();
        arrayUtilTest.bubbleSortTest();
    }

    public void containsNumberShouldReturnTrueTest(int number){
        ArrayUtil test = new ArrayUtil();
        int[] array = {1, 2, 3};
        boolean result = test.containsNumber(array, number);
        check(result, "containsNumberShouldReturnTrueTest");
    }

    public void containsNumberShouldReturnFalseTest(int number){
        ArrayUtil test = new ArrayUtil();
        int[] array = {1, 2, 3};
        boolean result = test.containsNumber(array, number);
        check(!result, "containsNumberShouldReturnFalseTest");
    }

    public void containsNumberTimesShouldReturnZeroTest(int number) {
        ArrayUtil test = new ArrayUtil();
        int[] array = {1, 2, 3};
        int actualResult = test.containsNumberTimes(array, number);
        check(0, actualResult, "containsNumberTimesShouldReturnZeroTest");
    }

    public void containsNumberTimesShouldReturnNumberTest(int number){
        ArrayUtil test = new ArrayUtil();
        int[] array = {1, 2, 5, 5, 5};
        int actualResult = test.containsNumberTimes(array,number);
        check(3, actualResult, "containsNumberTimesShouldReturnNumberTest");
    }

    public void replaceFirstNumberTest(){
        ArrayUtil test = new ArrayUtil();
        int[] expectedArray = {2, 1, 2, 3};
        int[] originalArray = {1, 1, 2, 3};
        test.replaceFirstMatch(originalArray, 1, 2);
        check(Arrays.equals(expectedArray, originalArray), "replaceFirstNumberTest");
    }

    public void replaceAllMatchesTest(){
        ArrayUtil test = new ArrayUtil();
        int[] expectedArray = {2, 2, 2, 3};
        int[] originalArray = {1, 1, 2, 3};
        test.replaceAllMatches(originalArray, 1, 2);
        check(Arrays.equals(expectedArray, originalArray), "replaceAllMatchesTest");
    }

    public void reverseArrayTest(){
        ArrayUtil test = new ArrayUtil();
        int[] expectedArray = {6, 5, 4, 1, 3};
        int[] originalArray = {3, 1, 4, 5, 6};
        test.reverseArray(originalArray);
        check(Arrays.equals(expectedArray, originalArray), "reverseArrayTest");
    }

    public void bubbleSortTest(){
        ArrayUtil test = new ArrayUtil();
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] originalArray = {5, 4, 3, 2, 1};
        test.bubbleSort(originalArray);
        check(Arrays.equals(expectedArray, originalArray), "bubbleSortTest");
    }

    public void check(int expectedResult, int actualResult, String testName){
        if(expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(boolean condition, String testName){
        if(condition){
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
