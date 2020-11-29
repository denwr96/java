package main.java.javaguru.sunday.student_mihails_gutmans.lesson4.level4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.maxNumberOfTwoTest_1_FirstNumberIsMax();
        calculatorTest.maxNumberOfTwoTest_2_SecondNumberIsMax();
        calculatorTest.maxNumberOfTwoTest_3_NumbersEqual();
        calculatorTest.maxNumberOfThreeFirstBiggerTest();
        calculatorTest.maxNumberOfThreeSeconfBiggerTest();
        calculatorTest.maxNumberOfThreeThirdBiggerTest();
        calculatorTest.maxNumberOfThreeFirstAndSecondEqualAndBiggerTest();
        calculatorTest.maxNumberOfThreeAllThreeEqualTest();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 15;
        Calculator victim = new Calculator();
        int result = victim.sum(firstNumber, secondNumber);
        if (result == 25) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 12;
        int secondNumber = 8;
        Calculator victim = new Calculator();
        int result = victim.sub(firstNumber, secondNumber);
        if (result == 4) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void multTest() {
        int firstNumber = 10;
        int secondNumber = 8;
        Calculator victim = new Calculator();
        int result = victim.mult(firstNumber, secondNumber);
        if (result == 80) {
            System.out.println("Mult test = OK");
        } else {
            System.out.println("Mult test = FAIL");
        }
    }
    public void devTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        Calculator victim = new Calculator();
        int result = victim.dev(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Dev test = OK");
        } else {
            System.out.println("Dev test = FAIL");
        }
    }
    public void isEvenTest() {
        int number = 10;
        Calculator victim = new Calculator();
        boolean result = victim.isEven(number);
        if (result == true) {
            System.out.println("Is Even test = OK");
        } else {
            System.out.println("Is Even test = FAIL");
        }
    }
    public void maxNumberOfTwoTest_1_FirstNumberIsMax() {
        int firstNumber = 10;
        int secondNumber = 8;
        Calculator victim = new Calculator();
        int result = victim.maxNumberOfTwo(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("maxNumberOfTwo first test = OK");
        } else {
            System.out.println("maxNumberOfTwo first test = FAIL");
        }
    }
    public void maxNumberOfTwoTest_2_SecondNumberIsMax() {
        int firstNumber = 5;
        int secondNumber = 18;
        Calculator victim = new Calculator();
        int result = victim.maxNumberOfTwo(firstNumber, secondNumber);
        if (result == 18) {
            System.out.println("maxNumberOfTwo second test = OK");
        } else {
            System.out.println("maxNumberOfTwo second test = FAIL");
        }
    }
    public void maxNumberOfTwoTest_3_NumbersEqual() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator victim = new Calculator();
        int result = victim.maxNumberOfTwo(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("MaxNumberOfTwo third test = OK");
        } else {
            System.out.println("MaxNumberOfTwo trhird test = FAIL");
        }
    }
    public void maxNumberOfThreeFirstBiggerTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 2;
        Calculator victim = new Calculator();
        int result = victim.maxNumberOfThree(firstNumber, secondNumber , thirdNumber);
        if (result == 10) {
            System.out.println("MaxNumberOfThree first test  = OK");
        } else {
            System.out.println("MaxNumberOfThree first test = FAIL");
        }
    }
    public void maxNumberOfThreeSeconfBiggerTest() {
        int firstNumber = 3;
        int secondNumber = 5;
        int thirdNumber = 2;
        Calculator victim = new Calculator();
        int result = victim.maxNumberOfThree(firstNumber, secondNumber , thirdNumber);
        if (result == 5) {
            System.out.println("MaxNumberOfThree second test  = OK");
        } else {
            System.out.println("MaxNumberOfThree second test = FAIL");
        }
    }
    public void maxNumberOfThreeThirdBiggerTest() {
        int firstNumber = 3;
        int secondNumber = 5;
        int thirdNumber = 8;
        Calculator victim = new Calculator();
        int result = victim.maxNumberOfThree(firstNumber, secondNumber , thirdNumber);
        if (result == 8) {
            System.out.println("MaxNumberOfThree third test  = OK");
        } else {
            System.out.println("MaxNumberOfThree third test = FAIL");
        }
    }
    public void maxNumberOfThreeFirstAndSecondEqualAndBiggerTest() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 1;
        Calculator victim = new Calculator();
        int result = victim.maxNumberOfThree(firstNumber, secondNumber , thirdNumber);
        if (result == 3) {
            System.out.println("MaxNumberOfThree fourth test  = OK");
        } else {
            System.out.println("MaxNumberOfThree fourth test = FAIL");
        }
    }
    public void maxNumberOfThreeAllThreeEqualTest() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;
        Calculator victim = new Calculator();
        int result = victim.maxNumberOfThree(firstNumber, secondNumber , thirdNumber);
        if (result == 3) {
            System.out.println("MaxNumberOfThree fifth test  = OK");
        } else {
            System.out.println("MaxNumberOfThree fifth test = FAIL");
        }
    }
}

