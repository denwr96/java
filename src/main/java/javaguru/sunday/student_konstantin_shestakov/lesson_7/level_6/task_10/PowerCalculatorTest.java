package javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 10
@CodeReview(approved = true)
class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.exponentiationTest();
    }

    void exponentiationTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        checkResults(powerCalculator.exponentiation(5,-5) == Math.pow(5, -5), "Exponentiation test 1");
        checkResults(powerCalculator.exponentiation(5,0) == Math.pow(5, 0), "Exponentiation test 2");
        checkResults(powerCalculator.exponentiation(5,5) == Math.pow(5, 5), "Exponentiation test 3");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }
}
