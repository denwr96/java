package javaguru.sunday.student_deniss_lobacs.lesson_4.level_2_intern.task5;
import  javaguru.sunday.student_deniss_lobacs.lesson_4.level_1_intern.task1.QuickMath;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Весь QuickMath нужно было уместить в одном классе")
public class QuickMathTest {

    public static void main(String[] args) {
        QuickMathTest quickMathTest = new QuickMathTest();
        quickMathTest.test1();
        quickMathTest.test2();
        quickMathTest.test3();
    }

    public void test1() {
        QuickMath victim = new QuickMath();
        int numberOne = 30;
        int numberTwo = 20;
        int expectedResult = 30;
        int actualResult = victim.Max(numberOne , numberTwo);
        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        QuickMath victim = new QuickMath();
        int numberOne = 10;
        int numberTwo = 20;
        int expectedResult = 20;
        int actualResult = victim.Max(numberOne , numberTwo);
        check(expectedResult, actualResult, "Test2");
    }

    public void test3() {
        QuickMath victim = new QuickMath();
        int numberOne = 10;
        int numberTwo = 20;
        int expectedResult = 10;
        int actualResult = victim.Max(numberOne , numberTwo);
        check(expectedResult, actualResult, "Test3");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}

