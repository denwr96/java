package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_6.level_1;

// Task 1

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest(2);
        calculatorTest.isEvenTest(3);
    }

    public void isEvenTest(int number) {
        Calculator calculator = new Calculator();
        boolean condition = calculator.isEven(number);
        System.out.println("Number: " + number);
        checkResults(condition, "Is Even Test");
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
