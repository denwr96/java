package main.java.javaguru.sunday.student_kristina_sutugina.lesson_7.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Можно было бы хотябы по тесту на метод сделать...")
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.sortArrayTest();

    }

    public void sortArrayTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {5, 2, 8};
        int[] expectedResult = {2, 5, 8};
        int[] result = arrayUtil.sortArray(testArray);
        check(expectedResult, result, "sortArrayTest");
    }

    public void check(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " passed.");
        } else {
            System.out.println(testName + " failed.");
        }
    }
}
