package javaguru.sunday.student_natalia_kochkina.lesson_4.level_4;

//Task_12
//Task_13
//Task_14
//Task_15

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest();
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

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        double result = calculator.div(firstNumber, secondNumber);
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

    public void isEvenTest() {
        int evenNumber = 7;
        Calculator calculator = new Calculator();
        boolean isEven = calculator.isEven(evenNumber);
        if (!isEven) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

    public  void maxOfTwoNumbersTest() {
        int firsNumber = 5;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        int maxOfTwoNumbers = calculator.maxOfTwoNumbers(firsNumber, secondNumber);
        if (maxOfTwoNumbers == 5) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    public  void maxOfTwoNumbersTest2() {
        int firsNumber = 7;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int maxOfTwoNumbers = calculator.maxOfTwoNumbers(firsNumber, secondNumber);
        if (maxOfTwoNumbers == 8) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    public  void maxOfTwoNumbersTest3() {
        int firsNumber = 7;
        int secondNumber = 7;
        Calculator calculator = new Calculator();
        int maxOfTwoNumbers = calculator.maxOfTwoNumbers(firsNumber, secondNumber);
        if (maxOfTwoNumbers == 7) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 7;
        int secondNumber = 4;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int maxOfThreeNumbers = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (maxOfThreeNumbers == 7) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest2() {
        int firstNumber = 7;
        int secondNumber = 9;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int maxOfThreeNumbers = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (maxOfThreeNumbers == 9) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = 7;
        int secondNumber = 4;
        int thirdNumber = 88;
        Calculator calculator = new Calculator();
        int maxOfThreeNumbers = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (maxOfThreeNumbers == 88) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest4() {
        int firstNumber = 9;
        int secondNumber = 9;
        int thirdNumber = 8;
        Calculator calculator = new Calculator();
        int maxOfThreeNumbers = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (maxOfThreeNumbers == 9) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest5() {
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 7;
        Calculator calculator = new Calculator();
        int maxOfThreeNumbers = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (maxOfThreeNumbers == 7) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }
    }
}
