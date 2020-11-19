package main.java.javaguru.sunday.student_liana_shirmane.lesson_7.level_6;

import java.util.Arrays;

public class CopyTest {
    public static void main(String[] args) {
        CopyTest test  = new CopyTest();
        test.shouldSelectNumbers();
    }

    public void shouldSelectNumbers () {
        Copy test = new Copy();
        int[] in = {4, 5, 6, 8, 2, 87, 10, 20};
        int[] actualResult = test.copyInRange(in, 1, 5);
        int[] expectedResult = {4, 5, 2};
        check(Arrays.equals(expectedResult, actualResult), "Select numbers from array");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}


