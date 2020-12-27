package javaguru.sunday.student_nataliya_sinitsa.lesson6.level3.task9;

//Task 31 - Task 41 (Lesson 5)
//Task 9 - Task 14 (Lesson 6)

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray1();
        test.shouldCreateArray2();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.shouldFindNumber1();
        test.shouldFindNumber2();
        test.shouldFindNumberQuantity1();
        test.shouldFindNumberQuantity2();
        test.shouldReplaceNumber1();
        test.shouldReplaceNumber2();
        test.shouldReplaceNumbers1();
        test.shouldReplaceNumbers2();
        test.shouldReverseArray1();
        test.shouldReverseArray2();
        test.shouldSortArray();
    }

    public void shouldCreateArray1() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = victim.createArray(5);
        check(5, testArray.length, "Should create array Test");
    }

    public void shouldCreateArray2() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = victim.createArray(10);
        check(10, testArray.length, "Should create array Test");
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = victim.createArray(5);
        victim.fillArrayWithRandomNumbers(testArray);

        int sum = 0;
        for (int testArrayItem : testArray) {
            sum = +testArrayItem;
        }

        boolean isSumNotNull;
        isSumNotNull = sum != 0;
        check(isSumNotNull, "Should fill array with random numbers Test");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = victim.createArray(5);
        victim.fillArrayWithRandomNumbers(testArray);

        int testMaxNumber = testArray[4];
        for (int i = 3; i >= 0; i--) {
            if (testArray[i] > testMaxNumber) {
                testMaxNumber = testArray[i];
            }
        }
        check(victim.findMaxNumber(testArray), testMaxNumber, "Find max number Test");
    }

    public void shouldFindMinNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = victim.createArray(5);
        victim.fillArrayWithRandomNumbers(testArray);

        int testMinNumber = testArray[4];
        for (int i = 3; i >= 0; i--) {
            if (testArray[i] < testMinNumber) {
                testMinNumber = testArray[i];
            }
        }
        check(victim.findMinNumber(testArray), testMinNumber, "Find min number Test");
    }

    public void shouldFindNumber1() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 2, 3, 4, 4};
        int number = 4;
        check(victim.findNumber(testArray, number), "Array contains number 4", "shouldFindNumber1");
    }

    public void shouldFindNumber2() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 2, 3, 3, 3};
        int number = 4;
        check(victim.findNumber(testArray, number), "Array does not contain number 4",
                "shouldFindNumber2");
    }

    public void shouldFindNumberQuantity1() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 2, 3, 4, 4};
        int number = 4;
        check(victim.findNumberQuantity(testArray, number), "Array contains 2 of 4",
                "shouldFindNumberQuantity1");
    }

    public void shouldFindNumberQuantity2() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 2, 3, 4, 4};
        int number = 5;
        check(victim.findNumberQuantity(testArray, number), "Array contains 0 of 5",
                "shouldFindNumberQuantity2");
    }

    public void shouldReplaceNumber1() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 2, 3, 4, 4};
        victim.replaceNumber(testArray, 4, 5);
        boolean isNumberReplaced = testArray[3] == 5 && testArray[4] ==4;
        check(isNumberReplaced, "shouldReplaceNumber1");
    }

    public void shouldReplaceNumber2() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 2, 3, 4, 4};
        victim.replaceNumber(testArray, 5, 10);
        boolean numberIsNotReplaced = testArray[0] != 10 && testArray[1] != 10 && testArray[2] != 10
                && testArray[3] != 10 && testArray[4] != 10;
        check(numberIsNotReplaced, "shouldReplaceNumber2");
    }

    public void shouldReplaceNumbers1() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 2, 3, 4, 4};
        victim.replaceNumbers(testArray, 4, 5);
        boolean isNumberReplaced = testArray[3] == 5 && testArray[4] == 5;
        check(isNumberReplaced, "shouldReplaceNumbers1");
    }

    public void shouldReplaceNumbers2() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 2, 3, 4, 4};
        victim.replaceNumbers(testArray, 5, 10);
        boolean numberIsNotReplaced = testArray[0] != 10 && testArray[1] != 10 && testArray[2] != 10
                && testArray[3] != 10 && testArray[4] != 10;
        check(numberIsNotReplaced, "shouldReplaceNumbers2");
    }

    public void shouldReverseArray1() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 2, 3};
        victim.reverseArray(testArray);
        boolean arrayIsReversed = testArray[0] == 3 && testArray[1] == 2 && testArray[2] == 1;
        check(arrayIsReversed, "shouldReverseArray1");
    }

    public void shouldReverseArray2() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 2, 3, 4};
        victim.reverseArray(testArray);
        boolean arrayIsReversed = testArray[0] == 4 && testArray[1] == 3 && testArray[2] == 2 && testArray[3] == 1;
        check(arrayIsReversed, "shouldReverseArray2");
    }

    public void shouldSortArray() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {6, 2, 3, 4, 8, 7, 1, 5};
        int[] expectedSortedArray = {1, 2, 3, 4, 5, 6, 7, 8};
        victim.sortArray(testArray);
        check(Arrays.equals(testArray, expectedSortedArray), "shouldSortArray");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

//    Проверка вывода на консоль для себя - чтобы знать, чтобы понимать
//    public void shouldPrintArrayToConsole() {
//        ArrayUtil victim = new ArrayUtil();
//        int testArray[] = victim.createArray(5);
//        victim.fillArrayWithRandomNumbers(testArray);
//        victim.printArrayToConsole(testArray);
//    }

}
