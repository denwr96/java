package main.java.javaguru.sunday.teacher.lesson_4.lessoncode.testexample;

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
        int expectedResult = 20;

        int actualResult = victim.max(numberOne, numberTwo);

        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        QuickMath victim = new QuickMath();

        int numberOne = -5;
        int numberTwo = -3;
        int expectedResult = -3;

        int actualResult = victim.max(numberOne, numberTwo);

        check(expectedResult, actualResult, "Test2");
    }

    public void test3() {
        QuickMath victim = new QuickMath();

        boolean actualResult = victim.isEven(4);

        check(actualResult, "Test3");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + "  has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + "  has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + "  has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
