package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_4_junior.task13;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_1_intern.task1.QuickMath;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        QuickMath calculator = new QuickMath();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        QuickMath calculator = new QuickMath();
        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        QuickMath calculator = new QuickMath();
        int result = calculator.mul(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        QuickMath calculator = new QuickMath();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 10;
        QuickMath calculator = new QuickMath();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

}
