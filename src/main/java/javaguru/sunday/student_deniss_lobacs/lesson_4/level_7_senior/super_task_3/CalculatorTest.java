package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_7_senior.super_task_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }


    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        int expectedResult = 75;
        int actualResult = calculator.sum(firstNumber , secondNumber);
        check(expectedResult , actualResult ,"sumTest");
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        int expectedResult = 20;
        int actualResult = calculator.sub(firstNumber , secondNumber);
        check(expectedResult , actualResult ,"subTest");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 25;
        int actualResult = calculator.mul(firstNumber , secondNumber);
        check(expectedResult , actualResult ,"mulTest");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        int expectedResult = 5;
        int actualResult = calculator.div(firstNumber , secondNumber);
        check(expectedResult , actualResult ,"divTest");
    }

    public void isEvenTest1() {
        int number = 3;
        boolean expectedResult = true;
        boolean actualResult = calculator.isEven(number);
        check(expectedResult , actualResult , "isEvenTest1");
    }

    public void isEvenTest2() {
        int number = 10;
        boolean expectedResult = true;
        boolean actualResult = calculator.isEven(number);
        check(expectedResult , actualResult , "isEvenTest2");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " OK");
        }   else {
            System.out.println(testName + " FAIL");
        }
    }

    public void check(boolean expectedResult , boolean actualResult , String testName) {
        if (expectedResult) {
            System.out.println(testName + " OK");
        }   else {
            System.out.println(testName + " FAIL");
        }
    }
}
