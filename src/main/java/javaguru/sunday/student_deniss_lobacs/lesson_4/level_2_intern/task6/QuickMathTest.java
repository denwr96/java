package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_2_intern.task6;
import  main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_1_intern.task1.QuickMath;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

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
        int numberOne = 10;
        int numberTwo = 20;
        int expectedResult = 10;
        int actualResult = victim.Min(numberOne , numberTwo);
        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        QuickMath victim = new QuickMath();
        int numberOne = 20;
        int numberTwo = 10;
        int expectedResult = 10;
        int actualResult = victim.Min(numberOne , numberTwo);
        check(expectedResult, actualResult, "Test2");
    }

    public void test3() {
        QuickMath victim = new QuickMath();
        int numberOne = 20;
        int numberTwo = 10;
        int expectedResult = 20;
        int actualResult = victim.Min(numberOne , numberTwo);
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

