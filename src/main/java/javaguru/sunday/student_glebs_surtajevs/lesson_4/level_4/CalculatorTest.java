package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_4.level_4;

//Task_11
//Task_12
//Task_13
//Task_14
//Task_15

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
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
        Calculator calculator = new Calculator();
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
        Calculator calculator = new Calculator();
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
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }
    public void isEvenTest() {
        int number = 9;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("Even test = Even");
        } else {
            System.out.println("Even test = Odd");
        }
    }
    public void maxOfTwoNumbersTest() {
        int firstNumber = 18;
        int secondNumber = 30;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("The biggest number is " + firstNumber);
        } else
            System.out.println("The biggest number is " + secondNumber);
    }
    public void maxOfThreeNumbersTest1() {
        int firstNumber = 9;
        int secondNumber = 10;
        int thirdNumber = 11;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("The biggest number is " + firstNumber);
        } else
            System.out.println("FAIL");
    }
    public void maxOfThreeNumbersTest2() {
        int firstNumber = 9;
        int secondNumber = 10;
        int thirdNumber = 11;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber) {
            System.out.println("The biggest number is " + secondNumber);
        } else
            System.out.println("FAIL");
    }
    public void maxOfThreeNumbersTest3() {
        int firstNumber = 9;
        int secondNumber = 10;
        int thirdNumber = 11;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == thirdNumber) {
            System.out.println("The biggest number is " + thirdNumber);
        } else
            System.out.println("FAIL");
    }
    public void maxOfThreeNumbersTest4() {
        int firstNumber = 9;
        int secondNumber = 9;
        int thirdNumber = 11;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("The biggest number is " + firstNumber);
        } else
            System.out.println("FAIL");
    }
    public void maxOfThreeNumbersTest5() {
        int firstNumber = 3;
        int secondNumber = 9;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("The biggest number is " + firstNumber);
        } else
            System.out.println("FAIL");
    }
}
