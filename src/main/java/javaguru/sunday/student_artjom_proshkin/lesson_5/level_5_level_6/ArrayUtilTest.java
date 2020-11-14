package main.java.javaguru.sunday.student_artjom_proshkin.lesson_5.level_5_level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_32
//Task_34 RandomTHINK
//Task_37
//Task_39
@CodeReview(approved = true)
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    void shouldCreateArray() {
        ArrayUtil victim = new ArrayUtil();
        int[] expectedResult = victim.createArray(6);
        checkResult(expectedResult.length == 6, "shouldCreateArray");
    }

    void shouldFillArrayWithRandomNumbers() {
        ArrayUtil victim = new ArrayUtil();
        int[] myRandomFill = victim.createArray(5);
        victim.fillArrayWithRandomNumbers(myRandomFill);
        victim.printArrayToConsole(myRandomFill);
        System.out.println("If you see arrays numbers, test PASSED, otherwise it FAILED ");

    }

    void shouldFindMaxNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] arrayWithMax = {3, -85, 10, -6, 100};
        int actualResult = victim.findMaxNumber(arrayWithMax);
        checkResult(100, actualResult, "shouldFindMaxNumber");
    }

    void shouldFindMinNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] arrayWithMin = {4, -95, 9, -5, 99};
        int actualResult = victim.findMinNumber(arrayWithMin);
        checkResult(-95, actualResult, "shouldFindMinNumber");
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
