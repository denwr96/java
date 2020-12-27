package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_13;


import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class CopyTest {

    public static void main(String[] args) {
        CopyTest copyTest = new CopyTest();
        copyTest.copyTest();
    }

    void copyTest() {
        Copy copy = new Copy();
        int[] range = {1, 2, 3, 4, 5, 6, 20, 50, 60, 1, 2, 3};
        int[] out = copy.copyInRange(range, 1, 3);
        int[] expectedOutArray = {1, 2, 3, 1, 2, 3};
        System.out.println("Array one: " + Arrays.toString(range));
        System.out.println("Expected result: " + Arrays.toString(expectedOutArray));
        System.out.println("Actual result: " + Arrays.toString(out));
        checkResults(Arrays.equals(out, expectedOutArray), "Copy test");
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
