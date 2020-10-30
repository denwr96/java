package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_4;

// Task 11
// Task 12
// Task 13
// Task 14
// Task 15

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.remainderTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4firstNumberEqualSecondAndThirdIsLower();
        calculatorTest.maxOfThreeNumbersTest5secondNumberEqualThirdAndFirstIsLower();
        calculatorTest.maxOfThreeNumbersTest6firstNumberEqualThirdAndSecondIsLower();
        calculatorTest.maxOfThreeNumbersTest7allNumbersAreEqual();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        }
        else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        }
        else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        double result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        }
        else {
            System.out.println("Division test = FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiplication test = OK");
        }
        else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void remainderTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.remainder(firstNumber, secondNumber);
        if (result == 0) {
            System.out.println("Remainder test = OK");
        }
        else {
            System.out.println("Remainder test = FAIL");
        }
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(4);
        if (result) {
            System.out.println("IsEven test = OK");
        }
        else {
            System.out.println("IsEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 15;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber && result != secondNumber) {
            System.out.println("Max of two numbers test, first number is greater = OK");
//            System.out.println("Max of two numbers test, second number is greater = FAIL");
//            System.out.println("Max of two numbers test, numbers are even = FAIL");
        }
        else if (result != firstNumber && result == secondNumber) {
//            System.out.println("Max of two numbers test, first number is greater = FAIL");
            System.out.println("Max of two numbers test, second number is greater = OK");
//            System.out.println("Max of two numbers test, numbers are even = FAIL");
        }
        else {
//            System.out.println("Max of two numbers test, first number is greater = FAIL");
//            System.out.println("Max of two numbers test, second number is greater = FAIL");
            System.out.println("Max of two numbers test, numbers are even = OK");
        }
    }

    public void maxOfThreeNumbersTest1() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == firstNumber && result != secondNumber && result != thirdNumber) {
            System.out.println("Max of three numbers test 1, first number is greater test = OK");
        }
        else  {
            System.out.println("Max of three numbers test 1, first number is greater test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest2() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == secondNumber && result != firstNumber && result != thirdNumber) {
            System.out.println("Max of three numbers test 2, second number is greater test = OK");
        }
        else {
            System.out.println("Max of three numbers test 2, second number is greater test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == thirdNumber && result != firstNumber && result != secondNumber) {
            System.out.println("Max of three numbers test 3, third number is greater test = OK");
        }
        else {
            System.out.println("Max of three numbers test 3, third number is greater test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest4firstNumberEqualSecondAndThirdIsLower() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == firstNumber && result == secondNumber && result != thirdNumber) {
            System.out.println("Max of three numbers test 4, first = second > third number = OK");
        }
        else {
            System.out.println("Max of three numbers test 4, first = second > third number = FAIL");
        }
    }

    public void maxOfThreeNumbersTest5secondNumberEqualThirdAndFirstIsLower() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == secondNumber && result == thirdNumber && result != firstNumber) {
            System.out.println("Max of three numbers test 5, first < second = third number = OK");
        }
        else {
            System.out.println("Max of three numbers test 5, first < second = third number = FAIL");
        }
    }

    public void maxOfThreeNumbersTest6firstNumberEqualThirdAndSecondIsLower() {
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == firstNumber && result == thirdNumber && result > secondNumber) {
            System.out.println("Max of three numbers test 6, first = third > second number = OK");
        }
        else {
            System.out.println("Max of three numbers test 6, first = third > second number = FAIL");
        }
    }

    public void maxOfThreeNumbersTest7allNumbersAreEqual() {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == firstNumber && result == secondNumber && result == thirdNumber) {
            System.out.println("Max of three numbers test 7, first = second = third number = OK");
        }
        else {
            System.out.println("Max of three numbers test 7, first = second = third number = FAIL");
        }
    }


}
