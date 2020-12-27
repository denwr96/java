package javaguru.sunday.student_kristina_sutugina.lesson_7.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

//Task_13
@CodeReview(approved = true)
class CopyTest {
    public static void main(String[] args) {
        CopyTest copyTest = new CopyTest();
        copyTest.copyTest();
    }

    public void copyTest() {
        Copy copy = new Copy();
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedResult = {4, 5, 6, 7, 8};
        int[] copiedArray = copy.copyInRange(testArray, 4, 8);
        check(expectedResult, copiedArray, "copyTest");
    }

    public void check(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " is passed");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
