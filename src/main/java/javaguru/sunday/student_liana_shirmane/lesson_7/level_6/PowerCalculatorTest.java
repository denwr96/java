package main.java.javaguru.sunday.student_liana_shirmane.lesson_7.level_6;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.exponentMoreThanZero();
        test.exponentIsZero();
        test.exponentIsLessThanZero();
    }

    public void exponentMoreThanZero() {
        PowerCalculator test = new PowerCalculator();
        double actualResult = test.power(2,3);
        int expectedResult = 8;
        check(expectedResult, actualResult, "Exponent > 0 test ");
    }
    public void exponentIsZero() {
        PowerCalculator test = new PowerCalculator();
        double actualResult = test.power(2,0);
        int expectedResult = 1;
        check(expectedResult, actualResult, "Exponent = 0 test ");
    }
    public void exponentIsLessThanZero() {
        PowerCalculator test = new PowerCalculator();
        double actualResult = test.power(2,-2);
        double expectedResult = 0.25;
        check(expectedResult, actualResult, "Exponent < 0 test ");
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
