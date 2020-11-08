package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_1.task1;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest testCalculator = new CalculatorTest();
        testCalculator.checkToEven();
        testCalculator.checkToNotEven();
    }

    public void checkToEven() {
        int numberOne = 10;
        boolean expectedResult = true;
        boolean actualResult = Calculator.isEven(numberOne);
        check(actualResult == expectedResult, "Check to even number -");
    }

    public void checkToNotEven() {
        int numberOne = 5;
        boolean expectedResult = false;
        boolean actualResult = Calculator.isEven(numberOne);
        check(actualResult == expectedResult, "Check to not even number -");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
