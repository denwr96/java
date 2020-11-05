package main.java.javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_5_and_6;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_5_and_6.ArrayUtil;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        int length = 5;
        int[] array = ArrayUtil.createArray(length);
        check(array.length == length , "Test1"); // must be Ok
//        check(!Arrays.equals(array1 , array) , "Test2"); // must be Failed
    }

    public void shouldFillArrayWithRandomNumbers() {
        int[] array = ArrayUtil.createArray(10);
        ArrayUtil.fillArrayWithRandomNumbers(array);

        boolean containsZero = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                containsZero = true;
            }
        }

        if (containsZero = true){
            System.out.println("Array not contains random numbers");
        } else {
            System.out.println("Array contains random numbers");
        }
    }

    public void shouldFindMaxNumber() {
        int[] array = {1 , 2 , 3 , 0 , 0};
        ArrayUtil.printArrayToConsole(array);
        int expectedResult = 3;
        int actualResult = ArrayUtil.findMaxNumber(array);
        check(expectedResult , actualResult , "Test");
    }

    public void shouldFindMinNumber() {
        int[] array = {0 , 2 , 3 , 10 , 1};
        ArrayUtil.printArrayToConsole(array);
        int expectedResult = 0;
        int actualResult = ArrayUtil.findMinNumber(array);
        check(expectedResult , actualResult , "Test");
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
