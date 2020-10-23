package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_7_senior.super_task_2;

public class LeapYearTest {

    private LeapYear victim = new LeapYear();

    public static void main(String[] args) {
        LeapYearTest quickMathTest = new LeapYearTest();
        quickMathTest.test1();
        quickMathTest.test2();
        quickMathTest.test3();
        quickMathTest.test4();
        quickMathTest.test5();
        quickMathTest.test6();
    }

    public void test1() {
        int numberOne = 2;
        boolean expectedResult = false;
        boolean actualResult = victim.isLeapYear(numberOne);
        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        int numberOne = 2000;
        boolean expectedResult = true;
        boolean actualResult = victim.isLeapYear(numberOne);
        check(expectedResult, actualResult, "Test2");
    }

    public void test3() {
        int numberOne = 400;
        boolean expectedResult = true;
        boolean actualResult = victim.isLeapYear(numberOne);
        check(expectedResult, actualResult, "Test3");
    }

    public void test4() {
        int numberOne = 500;
        boolean expectedResult = false;
        boolean actualResult = victim.isLeapYear(numberOne);
        check(expectedResult, actualResult, "Test4");
    }

    public void test5() {
        int numberOne = 500;
        boolean expectedResult = true;
        boolean actualResult = victim.isLeapYear(numberOne);
        check(expectedResult, actualResult, "Test4");
    }

    public void test6() {
        int numberOne = 1999;
        boolean expectedResult = true;
        boolean actualResult = victim.isLeapYear(numberOne);
        check(expectedResult, actualResult, "Test4");
    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " Failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
