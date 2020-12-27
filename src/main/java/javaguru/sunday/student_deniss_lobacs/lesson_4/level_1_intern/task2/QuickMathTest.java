package javaguru.sunday.student_deniss_lobacs.lesson_4.level_1_intern.task2;
import  javaguru.sunday.student_deniss_lobacs.lesson_4.level_1_intern.task1.QuickMath;

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
        int expectedResult = 1;

        int actualResult = victim.function(numberOne);

        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        QuickMath victim = new QuickMath();

        int numberOne = -10;
        int expectedResult = -1;

        int actualResult = victim.function(numberOne);

        check(expectedResult, actualResult, "Test2");
    }

    public void test3() {
        QuickMath victim = new QuickMath();

        int numberOne = 0;
        int expectedResult = 0;

        int actualResult = victim.function(numberOne);

        check(expectedResult, actualResult, "Test3");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + "  has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}

