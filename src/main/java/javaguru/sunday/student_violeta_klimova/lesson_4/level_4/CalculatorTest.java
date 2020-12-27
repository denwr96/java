package javaguru.sunday.student_violeta_klimova.lesson_4.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task 12
//Task 13
//Task 14
//Task 15
@CodeReview(approved = true)
public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.evenTest();
        calculatorTest.notEvenTest();
        calculatorTest.maxOfTwoNumbersTestIfFirstNumberMax();
        calculatorTest.maxOfTwoNumbersTestIfSecondNumberMax();
        calculatorTest.maxOfTwoNumbersIfTheyAreEqual();
        calculatorTest.maxOfThreeNumbersTestIfFirstNumberMax();
        calculatorTest.maxOfThreeNumbersTestIfSecondNumberMax();
        calculatorTest.maxOfThreeNumbersTestIfThirdNumberMax();
        calculatorTest.maxOfThreeNumbersTestIfFirstAndSecondNumberMax();
        calculatorTest.maxOfThreeNumbersTestIfFirstAndThirdNumberMax();
        calculatorTest.maxOfThreeNumbersTestIfSecondAndThirdNumberMax();
        calculatorTest.maxOfThreeNumbersTestIfTheyThreeAreEqual();
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

    public void evenTest() {
        int number = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    public void notEvenTest() {
        int number = 11;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (!result) {
            System.out.println("Not even test = OK");
        } else {
            System.out.println("Not even test = FAIL");
        }
    }
    public void maxOfTwoNumbersTestIfFirstNumberMax() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("Max of two for first number test = OK");
        } else {
            System.out.println("Max of two for firs number test = FAIL");
        }
    }
    public void maxOfTwoNumbersTestIfSecondNumberMax() {
        int firstNumber = 5;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("Second number test = OK");
        } else {
            System.out.println("Second number test = FAIL");
        }
    }
    public void maxOfTwoNumbersIfTheyAreEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("They are equal = OK");
        } else {
            System.out.println("They are equal = FAIL");
        }
    }
    public void maxOfThreeNumbersTestIfFirstNumberMax() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Max of three if first number max test = OK");
        } else {
            System.out.println("Max of three test if first number max test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestIfSecondNumberMax() {
        int firstNumber = 1;
        int secondNumber = 5;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 5) {
            System.out.println("Max of three if second number are max test = OK");
        } else {
            System.out.println("Max of three if second number are max test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestIfThirdNumberMax() {
        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 8) {
            System.out.println("Max of three if third number are max test = OK");
        } else {
            System.out.println("Max of three if third number are max test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestIfFirstAndSecondNumberMax() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Max of three if first and second number are max test = OK");
        } else {
            System.out.println("Max of three if first and second number are max test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestIfFirstAndThirdNumberMax() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Max of three if first and third number are max test = OK");
        } else {
            System.out.println("Max of three if first and third number are max test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestIfSecondAndThirdNumberMax() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Max of three if second and third number are max test = OK");
        } else {
            System.out.println("Max of three if second and third number are max test = FAIL");
        }
    }
    public void maxOfThreeNumbersTestIfTheyThreeAreEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Max of three if they are equal = OK");
        } else {
            System.out.println("Max of three if they are equal  = FAIL");
        }
    }
}