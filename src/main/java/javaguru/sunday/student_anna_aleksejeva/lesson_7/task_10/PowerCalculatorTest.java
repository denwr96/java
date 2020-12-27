package javaguru.sunday.student_anna_aleksejeva.lesson_7.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.PowerCalculatorTesting();

    }
    public void PowerCalculatorTesting(){
        PowerCalculator victim = new PowerCalculator();
        int actualResult = (int) victim.power(2,7);
        int expectedResult = 128;
        testResult(actualResult, expectedResult, "PowerCalculatorTest");
    }

    public void testResult(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
