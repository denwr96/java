package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldContainNumber();
        test.shouldCountNumber();
        test.shouldReplaceFirstNumber();
        test.shouldReplaceAllNumbers();
        test.shouldFlipArray();
        test.shouldSortArray();
    }

    public void shouldContainNumber() { // task9
        int[] array = {0 , 2 , 3 , 10 , 1};
        boolean expectedResult = true;
        boolean actualResult = ArrayUtil.isContain(array , 10);
        check(actualResult == expectedResult , "Test");
    }

    public void shouldCountNumber() { // task10
        int[] array = {0, 0, 1, 1, 0, 0};
        int expectedResult = 2;
        int actualResult = ArrayUtil.counter(array, 1);
        check(actualResult == expectedResult, "Test");
    }

    public void shouldReplaceFirstNumber() { // task11
        int[] array = {8, 1, 2, 1, 8};
        int[] array1 = {8, 10, 2, 1, 8};
        ArrayUtil.replace(array, 1 , 10);
        ArrayUtil.printArrayToConsole(array);
        ArrayUtil.printArrayToConsole(array1);
        check(Arrays.equals(array,array1), "Test");
    }

    public void shouldReplaceAllNumbers() { // task12
        int[] array = {1, 5, 1, 5, 1, 1, 1};
        int[] array1 = {5, 5, 5, 5, 5, 5, 5};
        ArrayUtil.replaceAll(array, 1 , 5);
        ArrayUtil.printArrayToConsole(array);
        ArrayUtil.printArrayToConsole(array1);
        check(Arrays.equals(array,array1), "Test");
    }

    public void shouldFlipArray() { // task13
        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = {5, 4, 3, 2, 1};
        ArrayUtil.printArrayToConsole(array);
        ArrayUtil.flip(array);
        ArrayUtil.printArrayToConsole(array1);
        check(Arrays.equals(array,array1), "Test");
    }

    public void shouldSortArray() { // task14
        int[] array = {4, 1, 8, 8, 1};
        int[] array1 = {1, 1, 4, 8, 8};
        ArrayUtil.printArrayToConsole(array);
        ArrayUtil.sort(array);
        ArrayUtil.printArrayToConsole(array1);
        check(Arrays.equals(array,array1), "Test");
    }

    public boolean check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition = true;
        } else {
            System.out.println(testName + " = FAILED");
            return condition = false;
        }
    }

    public void check(int expectedResult , int actualResult , String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }

}
