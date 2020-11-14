package main.java.javaguru.sunday.student_sergej_savkin.lesson_7.level_6_middle.task_13;


import java.util.Arrays;

class CopyTest {
    public static void main(String[] args) {
        CopyTest copyTest = new CopyTest();
        copyTest.calculateNewRangeLengthTest();
        copyTest.copyInRangeTest();

    }

    public void calculateNewRangeLengthTest() {
        Copy test = new Copy();
        check(test.calculateNewRangeLength(new int[]{1, 2, 3, 4, 5}, 2, 4), 3, "calculateNewRangeLengthTest");
    }

    public void copyInRangeTest() {
        Copy test = new Copy();
        int[] expectedResult = {2, 5, 3, 8, 6, 4, 7};
        check(test.copyInRange(new int[]{2, 5, 1, 3, 8, 6, 9, 4, 7}, 2, 8), expectedResult, "copyInRangeTest");
    }

    public void check(int[] actualResult, int[] expectedResult, String testName) {
        if(Arrays.equals(actualResult, expectedResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
