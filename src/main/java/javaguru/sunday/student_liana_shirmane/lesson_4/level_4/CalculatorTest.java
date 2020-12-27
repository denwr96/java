package javaguru.sunday.student_liana_shirmane.lesson_4.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.evenTest();
        calculatorTest.maxTest1();
        calculatorTest.maxTest2();
        calculatorTest.maxTest3();
        calculatorTest.maxOfThreeTest1();
        calculatorTest.maxOfThreeTest2();
        calculatorTest.maxOfThreeTest3();
        calculatorTest.maxOfThreeTest4();
        calculatorTest.maxOfThreeTest5();
        calculatorTest.maxOfThreeTest6();
        calculatorTest.maxOfThreeTest7();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(firstNumber, secondNumber);
        check(expectedResult, actualResult, "Sum test");
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.sub(firstNumber, secondNumber);
        check(expectedResult, actualResult, "Subtraction test");
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int actualResult = calculator.mul(firstNumber, secondNumber);
        check(expectedResult, actualResult, "Multiplication test");
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int actualResult = calculator.div(firstNumber, secondNumber);
        check(expectedResult, actualResult, "Division test");
    }

    public void evenTest() {
        int firstNumber = 10;
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(firstNumber);
        check(actualResult, "Even test");
    }

    public void maxTest1() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(expectedResult, actualResult, "Max test1");
    }
    public void maxTest2() {
        int firstNumber = 4;
        int secondNumber = 8;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(expectedResult, actualResult, "Max test2");
    }
    public void maxTest3() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(expectedResult, actualResult, "Max test3");
    }

    public void maxOfThreeTest1() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 1;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, actualResult, "Max of three test1");
    }

    public void maxOfThreeTest2() {
        int firstNumber = 1;
        int secondNumber = 10;
        int thirdNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, actualResult, "Max of three test2");
    }

    public void maxOfThreeTest3() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 15;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, actualResult, "Max of three test3");
    }

    public void maxOfThreeTest4() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 1;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, actualResult, "Max of three test4");
    }

    public void maxOfThreeTest5() {
        int firstNumber = 2;
        int secondNumber = 7;
        int thirdNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, actualResult, "Max of three test5");
    }

    public void maxOfThreeTest6() {
        int firstNumber = 8;
        int secondNumber = 2;
        int thirdNumber = 8;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, actualResult, "Max of three test6");
    }
    public void maxOfThreeTest7() {
        int firstNumber = 8;
        int secondNumber = 8;
        int thirdNumber = 8;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, actualResult, "Max of three test7");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}



