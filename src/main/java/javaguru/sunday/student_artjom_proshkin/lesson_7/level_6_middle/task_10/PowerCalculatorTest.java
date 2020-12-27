package javaguru.sunday.student_artjom_proshkin.lesson_7.level_6_middle.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class PowerCalculatorTest {

    PowerCalculator victim = new PowerCalculator();

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.calculatePowerNumberTest();
        test.calculateNegativePowerNumberTest();

    }

    void calculatePowerNumberTest() {
        checkResult(16, victim.calculatePowerNumber(2,4),"CalculatePowerNumberTest");

    }
    void calculateNegativePowerNumberTest() {
        checkResult(0.25, victim.calculatePowerNumber(2,-2),"CalculateNegativePowerNumberTest");

    }

    void checkResult(double expected, double actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
            System.out.println("Expected = " + expected + "; Actual = " + actual + " " + testName);
        }
    }
}
