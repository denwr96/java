package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_1_intern.task1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
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
        boolean expectedResult = true;
        boolean actualResult = victim.isPositive(numberOne);
        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        QuickMath victim = new QuickMath();
        int numberOne = -2;
        boolean expectedResult = false;
        boolean actualResult = victim.isPositive(numberOne);
        check(expectedResult, actualResult, "Test1");
    }

    public void test3() {
        QuickMath victim = new QuickMath();
        int numberOne = 0;
        boolean expectedResult = true;
        boolean actualResult = victim.isPositive(numberOne);
        check(expectedResult, actualResult, "Test1");
    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + "  has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
