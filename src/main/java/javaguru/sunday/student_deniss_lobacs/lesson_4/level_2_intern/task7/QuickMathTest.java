package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_2_intern.task7;
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
    }

    public void test1() {
        QuickMath victim = new QuickMath();
        int numberOne = 10;
        int numberTwo = 20;
        boolean expectedResult = false;
        boolean actualResult = victim.isEquals(numberOne , numberTwo);
        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        QuickMath victim = new QuickMath();
        int numberOne = 10;
        int numberTwo = 10;
        boolean expectedResult = true;
        boolean actualResult = victim.isEquals(numberOne , numberTwo);
        check(expectedResult, actualResult, "Test2");
    }


    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}

