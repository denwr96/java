package main.java.javaguru.sunday.student_kristina_sutugina.lesson_4.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_12
//Task_13
//Task_14
//Task_15
@CodeReview(approved = true)
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divisionTest();
        calculatorTest.evenTest();
        calculatorTest.maxOfTwoNumbersFirstNumberBigger();
        calculatorTest.maxOfTwoNumbersSecondNumberBigger();
        calculatorTest.maxOfTwoNumbersFirstNumberEqualsToSecond();
        calculatorTest.maxOfThreeNumbersFirstNumberTheBiggest();
        calculatorTest.maxOfThreeNumbersSecondNumberTheBiggest();
        calculatorTest.maxOfThreeNumbersThirdNumberTheBiggest();
        calculatorTest.maxOfThreeNumbersFirstAndSecondTheBiggest();
        calculatorTest.maxOfThreeNumbersFirstAndThirdTheBiggest();
        calculatorTest.maxOfThreeNumbersSecondAndThirdTheBiggest();
        calculatorTest.maxOfThreeNumbersAllEqual();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtract(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiply test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void evenTest() {
        int number = 5;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result == true) {
            System.out.println("Is even.");
        } else {
            System.out.println("False. Number isn't even.");
        }
    }

    public void maxOfTwoNumbersFirstNumberBigger() {
        int firstNumber = 10;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("Test true");
        } else {
            System.out.println("Failed. First number is not bigger.");
        }
    }

    public void maxOfTwoNumbersSecondNumberBigger() {
        int firstNumber = 10;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == secondNumber) {
            System.out.println("Test true");
        } else {
            System.out.println("Failed. Second number is not bigger.");
        }
    }

    public void maxOfTwoNumbersFirstNumberEqualsToSecond() {
        int firstNumber = 10;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber && result == secondNumber) {
            System.out.println("Test true");
        } else {
            System.out.println("Failed. They are not equal.");
        }
    }

    public void maxOfThreeNumbersFirstNumberTheBiggest() {
        int firstNumber = 10;
        int secondNumber = 1;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber && result != secondNumber && result != thirdNumber) {
            System.out.println("Test true. First number is the biggest.");
        } else {
            System.out.println("Failed. First number isn't the biggest.");
        }
    }

    public void maxOfThreeNumbersSecondNumberTheBiggest() {
        int firstNumber = 11;
        int secondNumber = 11;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber && result != thirdNumber && result != firstNumber) {
            System.out.println("Test true. Second number is the biggest.");
        } else {
            System.out.println("Failed. Second number isn't the biggest.");
        }
    }

    public void maxOfThreeNumbersThirdNumberTheBiggest() {
        int firstNumber = 11;
        int secondNumber = 11;
        int thirdNumber = 12;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == thirdNumber && result != firstNumber && result != secondNumber) {
            System.out.println("Test true. Third number is the biggest.");
        } else {
            System.out.println("Failed. Third number isn't the biggest.");
        }
    }

    public void maxOfThreeNumbersFirstAndSecondTheBiggest() {
        int firstNumber = 11;
        int secondNumber = 11;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber && firstNumber == secondNumber && result != thirdNumber) {
            System.out.println("Test true. First and second numbers are the biggest.");
        } else {
            System.out.println("Failed. First and second numbers aren't the biggest.");
        }
    }

    public void maxOfThreeNumbersFirstAndThirdTheBiggest() {
        int firstNumber = 12;
        int secondNumber = 11;
        int thirdNumber = 12;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber && firstNumber == thirdNumber && result != secondNumber) {
            System.out.println("Test true. First and third numbers are the biggest.");
        } else {
            System.out.println("Failed. First and third numbers aren't the biggest.");
        }
    }

    public void maxOfThreeNumbersSecondAndThirdTheBiggest() {
        int firstNumber = 10;
        int secondNumber = 12;
        int thirdNumber = 12;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber && secondNumber == thirdNumber && result != firstNumber) {
            System.out.println("Test true. Second and third numbers are the biggest.");
        } else {
            System.out.println("Failed. Second and third numbers aren't the biggest.");
        }
    }

    public void maxOfThreeNumbersAllEqual() {
        int firstNumber = 12;
        int secondNumber = 12;
        int thirdNumber = 12;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber && firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("Test true. All numbers are equal.");
        } else {
            System.out.println("Failed. Numbers aren't equal.");
        }
    }
}