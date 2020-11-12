package main.java.javaguru.sunday.student_artjom_proshkin.lesson_6.level_3;

//Task_9
//Task_10
//Task_11
//Task_12
//Task_13
//Task_14

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.hasNumberPassTest(15);
        test.hasNumberFailTest(5);
        test.hasNumberCounterTest(11);
        test.hasNumberCounterWithZeroOutTest(5);
        test.replaceFirstMatchNumberTest();
        test.replaceAllMatchNumbersTest();
        test.reverseArrayTest();
        test.bubbleSortArrayTest();

    }


    void hasNumberPassTest(int number) {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {11, -9, 15};
        boolean result = victim.hasNumber(myArray, number);
        checkResult(result, "hasNumberPassTest");
    }

    void hasNumberFailTest(int number) {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {11, -9, 15};
        boolean result = victim.hasNumber(myArray, number);
        checkResult(!result, "hasNumberFailTest");
    }

    void hasNumberCounterTest(int number) {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {11, -9, 15, 11};
        int actualResult = victim.hasNumberCounter(myArray, number);
        checkResult(2, actualResult, "hasNumberCounterTest");

    }

    void hasNumberCounterWithZeroOutTest(int number) {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {11, -9, 15, 11};
        int actualResult = victim.hasNumberCounter(myArray, number);
        checkResult(0, actualResult, "hasNumberCounterWithZeroTest");

    }

    void replaceFirstMatchNumberTest() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {11, -9, 15, 11};
        int[] finalArray = {-7, -9, 15, 11};
        victim.replaceFirstMatchNumber(testArray, 11, -7);
        checkResult(Arrays.equals(testArray, finalArray), "replaceFirstMatchNumberTest");

    }

    void replaceAllMatchNumbersTest() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {11, -9, 15, 11};
        int[] finalArray = {-7, -9, 15, -7};
        victim.replaceAllMatchNumbers(testArray, 11, -7);
        checkResult(Arrays.equals(testArray, finalArray), "replaceAllMatchNumbersTest");
    }

    void reverseArrayTest() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 7, 3, 4, 5};
        int[] finalArray = {5, 4, 3, 7, 1};
        victim.reverseArray(testArray);
        checkResult(Arrays.equals(testArray, finalArray), "reverseArrayTest");
    }

    void bubbleSortArrayTest() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {5, 1, 4, 2, 8};
        int[] finalArray = {1, 2, 4, 5, 8};
        victim.bubbleSortArray(testArray);
        checkResult(Arrays.equals(testArray, finalArray),"bubbleSortArrayTest");

    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILURE !");
        }
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + "FAILURE !");
            System.out.println("Expected = " + expectedResult + "; Actual = " + actualResult + "; Test = " + testName);
        }
    }
}
