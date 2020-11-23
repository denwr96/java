package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson7.level6.task13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class CopyTest {

    public static void main(String[] args) {
        CopyTest test = new CopyTest();
        test.shouldCopyInRange1();
        test.shouldCopyInRange2();
        test.shouldCopyInRange3();
    }

    public void shouldCopyInRange1() {
        Copy copy = new Copy();
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] rangeArray = copy.copyInRange(in, 3,8);
        int[] expectedArray = {3, 4, 5, 6, 7, 8};
        check(Arrays.equals(rangeArray, expectedArray), "shouldCopyInRange1");
    }

    public void shouldCopyInRange2() {
        Copy copy = new Copy();
        int[] in = {1, 2, 3, 4, 5, 5, 8, 8, 9, 10, 11, 12};
        int[] rangeArray = copy.copyInRange(in, 5,8);
        int[] expectedArray = {5, 5, 8, 8};
        check(Arrays.equals(rangeArray, expectedArray), "shouldCopyInRange2");
    }

    public void shouldCopyInRange3() {
        Copy copy = new Copy();
        int[] in = {7, 2, 3, 1, 5, 6, 8, 10, 9, 11, 11, 12, 13};
        int[] rangeArray = copy.copyInRange(in, 8,11);
        int[] expectedArray = {8, 10, 9, 11, 11};
        check(Arrays.equals(rangeArray, expectedArray), "shouldCopyInRange3");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
