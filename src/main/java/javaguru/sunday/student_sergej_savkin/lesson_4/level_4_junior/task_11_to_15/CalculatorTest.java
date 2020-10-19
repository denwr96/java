package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_4_junior.task_11_to_15;

// task12
// task14
// task15

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.maxOfTwoNumbersTestFirstNumberMax();
        calculatorTest.maxOfTwoNumbersTestSecondNumberMax();
        calculatorTest.maxOfTwoNumbersTestNumbersEqual();
        calculatorTest.maxOfThreeNumbersTestFirstNumberMax();
        calculatorTest.maxOfThreeNumbersTestSecondNumberMax();
        calculatorTest.maxOfThreeNumbersTestThirdNumberMax();
        calculatorTest.maxOfThreeNumbersTestFirstAndSecondNumberMax();
        calculatorTest.maxOfThreeNumbersTestFirstAndThirdNumberMax();
        calculatorTest.maxOfThreeNumbersTestSecondAndThirdNumberMax();
        calculatorTest.maxOfThreeNumbersTestAllNumberEqual();

    }

    public void sumTest(){
        int firstNumber = 10;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if(result == 13){
            System.out.println("Sum test - OK");
        } else {
            System.out.println("Sum test - FAIL");
        }
    }

    public void subTest(){
        int firstNumber = 5;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        if(result == 2){
            System.out.println("Sub test - OK");
        } else {
            System.out.println("Sub test - FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 5;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.mult(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Mult test - OK");
        } else {
            System.out.println("Mult test - FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 6;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Div test - OK");
        } else {
            System.out.println("Div test - FAIL");
        }
    }

    public void maxOfTwoNumbersTestFirstNumberMax(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10){
            System.out.println("maxOfTwoNumbersTestFirstNumberMax passed OK!");
        } else {
            System.out.println("maxOfTwoNumbersTestFirstNumberMax - FAILED");
        }
    }

    public void maxOfTwoNumbersTestSecondNumberMax(){
        int firstNumber = 5;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10){
            System.out.println("maxOfTwoNumbersTestSecondNumberMax passed OK!");
        } else {
            System.out.println("maxOfTwoNumbersTestSecondNumberMax - FAILED");
        }
    }

    public void maxOfTwoNumbersTestNumbersEqual(){
        int firstNumber = 10;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10){
            System.out.println("maxOfTwoNumbersTestNumbersEqual passed OK!");
        } else {
            System.out.println("maxOfTwoNumbersTestNumbersEqual - FAILED");
        }
    }

    public void maxOfThreeNumbersTestFirstNumberMax(){
        int firstNumber = 10;
        int secondNumber = 9;
        int thirdNumber = 9;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10){
            System.out.println("maxOfThreeNumbersTestFirstNumberMax passed OK!");
        } else {
            System.out.println("maxOfThreeNumbersTestFirstNumberMax FAILED!");
        }
    }

    public void maxOfThreeNumbersTestSecondNumberMax(){
        int firstNumber = 9;
        int secondNumber = 10;
        int thirdNumber = 9;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10){
            System.out.println("maxOfThreeNumbersTestSecondNumberMax passed OK!");
        } else {
            System.out.println("maxOfThreeNumbersTestSecondNumberMax FAILED!");
        }
    }

    public void maxOfThreeNumbersTestThirdNumberMax(){
        int firstNumber = 9;
        int secondNumber = 9;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10){
            System.out.println("maxOfThreeNumbersTestThirdNumberMax passed OK!");
        } else {
            System.out.println("maxOfThreeNumbersTestThirdNumberMax FAILED!");
        }
    }

    public void maxOfThreeNumbersTestFirstAndSecondNumberMax(){
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 9;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10){
            System.out.println("maxOfThreeNumbersTestFirstAndSecondNumberMax passed OK!");
        } else {
            System.out.println("maxOfThreeNumbersTestFirstAndSecondNumberMax FAILED!");
        }
    }
    public void maxOfThreeNumbersTestFirstAndThirdNumberMax(){
        int firstNumber = 10;
        int secondNumber = 9;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10){
            System.out.println("maxOfThreeNumbersTestFirstAndThirdNumberMax passed OK!");
        } else {
            System.out.println("maxOfThreeNumbersTestFirstAndThirdNumberMax FAILED!");
        }
    }

    public void maxOfThreeNumbersTestSecondAndThirdNumberMax(){
        int firstNumber = 9;
        int secondNumber = 10;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10){
            System.out.println("maxOfThreeNumbersTestSecondAndThirdNumberMax passed OK!");
        } else {
            System.out.println("maxOfThreeNumbersTestSecondAndThirdNumberMax FAILED!");
        }
    }

    public void maxOfThreeNumbersTestAllNumberEqual(){
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10){
            System.out.println("maxOfThreeNumbersTestAllNumberEqual passed OK!");
        } else {
            System.out.println("maxOfThreeNumbersTestAllNumberEqual FAILED!");
        }
    }
}
