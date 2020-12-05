package main.java.javaguru.sunday.student_artjom_proshkin.lesson_7.level_6_middle.task_13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class CopyTest {

    public static void main(String[] args) {
        CopyTest test = new CopyTest();
        test.copyInRangeTest1();
        test.copyInRangeTest2();

    }

    void copyInRangeTest1() {
        Copy victim = new Copy();
        int[] in = {10, 15, 16, 25, 20, 8};
        int [] expected = {10, 15, 16, 8};
        int [] actual = victim.copyInRange(in,8,16);
        checkResult(expected,actual,"copyInRangeTest1");
    }

    void copyInRangeTest2() {
        Copy victim = new Copy();
        int[] in = {-3, -15, -6, -25, 28, -10};
        int [] expected = {-15, -6, -10};
        int [] actual = victim.copyInRange(in,-15,-6);
        checkResult(expected,actual,"copyInRangeTest2");
    }

    void checkResult(int[] expected, int[] actual, String testName) {
        if (Arrays.equals(expected,actual)) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
            System.out.println("Expected = " + Arrays.toString(expected) + "; Actual = " + Arrays.toString(actual) + " " + testName);
        }
    }
}
