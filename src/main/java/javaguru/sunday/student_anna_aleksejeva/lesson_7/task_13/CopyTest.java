package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_7.task_13;


import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
public class CopyTest {
    public static void main(String[] args) {
        CopyTest test  = new CopyTest();
        test.selectNumbers();
    }
    public void selectNumbers () {
        Copy test = new Copy();
        int[] in = {1, 3, 6, 8, 2, 4};
        int[] actualResult = test.copyInRange(in, 1, 6);
        int[] expectedResult = {1, 3, 6, 2, 4};
        check(Arrays.equals(expectedResult, actualResult), "Numbers from array");
    }
    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed");
        }
        else {
            System.out.println(testName + " failed");
        }
    }
}