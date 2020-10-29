package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_5.level_5_and_6;

//Task 32
//Task 34
//Task 37
//Task 39

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayOne = arrayUtil.createArray(5);
        System.out.println(Arrays.toString(arrayOne));
        checkResults(Arrays.equals(arrayOne, arrayUtil.createArray(5)), "Array creation TEST");
//        checkResults((arrayOne[0] >= -2147483648 && arrayOne[0] <= 2147483647), "Array creation TEST");
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayOne = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(arrayOne);
        System.out.println(Arrays.toString(arrayOne));

        for (int i = 0; i < arrayOne.length; i++) {
            if (checkResults((arrayOne[i] >= -2147483648 && arrayOne[i] <= 2147483647), "Array fill TEST, element " + (i + 1))) {

            } else if (!checkResults((arrayOne[i] >= -2147483648 && arrayOne[i] <= 2147483647), "Array fill TEST, element " + (i + 1))) {
//
            }
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayOne = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(arrayOne);
        arrayUtil.findMaxNumber(arrayOne);
        arrayUtil.printArrayToConsole(arrayOne);

        for (int i = 0; i < arrayOne.length; i++) {
            if (checkResults(arrayUtil.findMaxNumber(arrayOne) == arrayOne[i], "Array MAX Test, element " + (i + 1))) {

            } else if (!checkResults(arrayUtil.findMaxNumber(arrayOne) == arrayOne[i], "Array MAX Test, element " + (i + 1))) {

            }
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayOne = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(arrayOne);
        arrayUtil.findMinNumber(arrayOne);
        arrayUtil.printArrayToConsole(arrayOne);

        for (int i = 0; i < arrayOne.length; i++) {
            if (checkResults(arrayUtil.findMinNumber(arrayOne) == arrayOne[i], "Array MIN Test, element " + (i + 1))) {

            } else if (!checkResults(arrayUtil.findMinNumber(arrayOne) == arrayOne[i], "Array MIN Test, element " + (i + 1))) {

            }
        }
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
