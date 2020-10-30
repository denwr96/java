package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_3_junior.task10;
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
        int numberOne = 2;
        int numberTwo = 2;
        int numberThree = 0;
        int expectedResult = 2;
        int actualResult = victim.maxOfThree(numberOne , numberTwo , numberThree);
        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        QuickMath victim = new QuickMath();
        int numberOne = 10;
        int numberTwo = 10;
        int numberThree = 10;
        int expectedResult = 10;
        int actualResult = victim.maxOfThree(numberOne , numberTwo , numberThree);
        check(expectedResult, actualResult, "Test2");
    }

    public void test3() {
        QuickMath victim = new QuickMath();
        int numberOne = 3;
        int numberTwo = 2;
        int numberThree = 1;
        int expectedResult = 1;
        int actualResult = victim.maxOfThree(numberOne , numberTwo , numberThree);
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


