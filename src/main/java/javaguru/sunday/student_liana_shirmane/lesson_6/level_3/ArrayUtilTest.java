package javaguru.sunday.student_liana_shirmane.lesson_6.level_3;

//task9
//task10
//task11
//task12
//task13
//task14

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldFindNumber();
        test.shouldNotFindNumber();
        test.howManyNumbersFind();
        test.replaceNumber();
        test.replaceAllNumbers();
        test.rotateNumbers();
        test.sortNumbers();
    }


    void shouldFindNumber() {
        int[] array = {5, 7, 9, 10, -7};
        ArrayUtil arrayUtil = new ArrayUtil();
        boolean result = arrayUtil.findNumber(array, 9);
        check(result, "Number found");
    }

    void shouldNotFindNumber() {
        int[] array = {5, 7, 9, 10, -7};
        ArrayUtil arrayUtil = new ArrayUtil();
        boolean result = arrayUtil.findNumber(array, 12);
        check(!result, "Number not found");
    }

    void howManyNumbersFind() {
        int[] array = {8, 8, 9, 0, 7, 5, 4, 8};
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = 3;
        int actualResult = arrayUtil.howManyNumbers(array, 8);
        check(expectedResult, actualResult, "Count numbers in array");
    }

    void replaceNumber() {
        int[] array = {8, 8, 9, 0, 7, 5, 9, 8};
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] expectedResult = {8, 8, 3, 0, 7, 5, 9, 8};
        arrayUtil.replaceNumber(array, 9, 3);
        check(Arrays.equals(expectedResult, array), "Replace numbers");
    }

    void replaceAllNumbers() {
        int[] array = {8, 8, 9, 0, 7, 5, 9, 8};
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] expectedResult = {8, 8, 3, 0, 7, 5, 3, 8};
        arrayUtil.replaceAllNumbers(array, 9, 3);
        check(Arrays.equals(expectedResult, array), "Replace all numbers");
    }

    void rotateNumbers() {
        int[] array = {1, 2, 3};
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] expectedResult = {3, 2, 1};
        arrayUtil.rotateNumbers(array);
        check(Arrays.equals(expectedResult, array), "Rotate numbers in array");
    }

    void sortNumbers() {
        int[] array = {5, 1, 3};
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] expectedResult = {1, 3, 5};
        arrayUtil.sortNumbers(array);
        check(Arrays.equals(expectedResult, array), "Sort numbers in array");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}



