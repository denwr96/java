package javaguru.sunday.student_nataliya_sinitsa.lesson4.level4;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 11 - Task 15
@CodeReview(approved = true)
class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
        calculatorTest.maxOfTwoNumbers1();
        calculatorTest.maxOfTwoNumbers2();
        calculatorTest.maxOfTwoNumbers3();
        calculatorTest.maxOfThreeNumbers1();
        calculatorTest.maxOfThreeNumbers2();
        calculatorTest.maxOfThreeNumbers3();
        calculatorTest.maxOfThreeNumbers4();
        calculatorTest.maxOfThreeNumbers5();
        calculatorTest.maxOfThreeNumbers6();
        calculatorTest.maxOfThreeNumbers7();
        calculatorTest.maxOfThreeNumbers8();
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
        int firstNumber = 13;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 19;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.mult(firstNumber, secondNumber);
        if (result == 38) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 49;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber); // возвращает целую часть от деления
        if (result == 6) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTest1() {
        int number = 8;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("1st 'Is even?' test = OK");
        } else {
            System.out.println("2nd 'Is even?' test = FAIL");
        }
    }

    public void isEvenTest2() {
        int number = 5;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (!result) {
            System.out.println("2nd 'Is even?' test = OK");
        } else {
            System.out.println("2nd 'Is even?' test = FAIL");
        }
    }

    public void maxOfTwoNumbers1() {
        int firstNumber = 3;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("Max of two numbers = OK");
        } else {
            System.out.println("Max of two numbers = FAIL");
        }
    }

    public void maxOfTwoNumbers2() {
        int firstNumber = 3;
        int secondNumber = -10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 3) {
            System.out.println("Max of two numbers = OK");
        } else {
            System.out.println("Max of two numbers = FAIL");
        }
    }

    public void maxOfTwoNumbers3() {
        int firstNumber = 3;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 3) {
            System.out.println("Max of two numbers = OK");
        } else {
            System.out.println("Max of two numbers = FAIL");
        }
    }

    public void maxOfThreeNumbers1() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbers2() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbers3() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbers4() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbers5() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbers6() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbers7() {
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

    public void maxOfThreeNumbers8() {
        int firstNumber = 3;
        int secondNumber = 1;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers = OK");
        } else {
            System.out.println("Max of three numbers = FAIL");
        }
    }

}

