package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4;
// task_11
// task_12
// task_13
// task_14
// task_15

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.multTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
        calculatorTest.maxOfThreeNumbersTest8();
        calculatorTest.maxOfThreeNumbersTest9();
        calculatorTest.maxOfThreeNumbersTest10();
    }

    public void sumTest() {
        int firstNumber = 7;
        int secondNumber = 8;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 80;
        int secondNumber = 10;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.sub(firstNumber, secondNumber);
        if (result == 70) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 75;
        int secondNumber = 15;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.div(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 9;
        int secondNumber = 7;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.mult(firstNumber, secondNumber);
        if (result == 63) {
            System.out.println("Mult test = OK");
        } else {
            System.out.println("Mult test = FAIL");
        }
    }

    public void isEvenTest() {
        Calculator myCalculator = new Calculator();
        boolean result = myCalculator.isEven(9);
        if (result) {
            System.out.println("isEven test = OK (number is even)");
        } else {
            System.out.println("isEven test = FAIL (number is odd)");
        }
    }

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 9;
        int secondNumber = 9;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber && result == secondNumber) {
            System.out.println("MaxOfTwoNumbersTest1 is OK, Numbers are equal " + result + '=' + result);
        } else {
            System.out.println("MaxOfTwoNumbersTest1 is failed");
        }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 9;
        int secondNumber = 8;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result >= firstNumber && result > secondNumber){
            System.out.println("MaxOfTwoNumbersTest2 is Ok, first number is higher");
        } else {
            System.out.println("MaxOfTwoNumbersTest2 is failed");
        }
    }
    public void maxOfTwoNumbersTest3() {
        int firstNumber = 7;
        int secondNumber = 9;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result > firstNumber && result == secondNumber){
            System.out.println("MaxOfTwoNumbersTest3 is Ok, second number is higher");
        } else {
            System.out.println("MaxOfTwoNumbersTest3 is failed");
        }
    }
    public void maxOfThreeNumbersTest1 (){
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 1;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result > secondNumber && result > thirdNumber){
            System.out.println("MaxOfThreeNumbersTest1 is Ok, first number is highest");
        }else{
            System.out.println("MaxOfThreeNumbersTest1 is failed");
        }
    }
    public void maxOfThreeNumbersTest2 (){
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 1;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result > firstNumber && result > thirdNumber){
            System.out.println("MaxOfThreeNumbersTest2 is Ok, second number is highest");
        }else{
            System.out.println("MaxOfThreeNumbersTest2 is failed");
        }
    }
    public void maxOfThreeNumbersTest3 (){
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result > firstNumber && result > secondNumber){
            System.out.println("MaxOfThreeNumbersTest3 is Ok, third number is highest");
        }else{
            System.out.println("MaxOfThreeNumbersTest2 is failed");
        }
    }
    public void maxOfThreeNumbersTest4 (){
        int firstNumber = 8;
        int secondNumber = 4;
        int thirdNumber = 4;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result > secondNumber && result > thirdNumber){
            System.out.println("MaxOfThreeNumbersTest4 is Ok, first number is highest");
        }else{
            System.out.println("MaxOfThreeNumbersTest4 is failed");
        }
    }
    public void maxOfThreeNumbersTest5 (){
        int firstNumber = 4;
        int secondNumber = 8;
        int thirdNumber = 4;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result > firstNumber && result > thirdNumber){
            System.out.println("MaxOfThreeNumbersTest5 is Ok, second number is highest");
        }else{
            System.out.println("MaxOfThreeNumbersTest5 is failed");
        }
    }
    public void maxOfThreeNumbersTest6 (){
        int firstNumber = 4;
        int secondNumber = 4;
        int thirdNumber = 8;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result > firstNumber && result > secondNumber){
            System.out.println("MaxOfThreeNumbersTest6 is Ok, third number is highest");
        }else{
            System.out.println("MaxOfThreeNumbersTest6 is failed");
        }
    }
    public void maxOfThreeNumbersTest7 (){
        int firstNumber = 8;
        int secondNumber = 8;
        int thirdNumber = 4;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result < firstNumber  && firstNumber == secondNumber){
            System.out.println("MaxOfThreeNumbersTest7 is Ok, first and second numbers are highest");
        }else{
            System.out.println("MaxOfThreeNumbersTest7 is failed");
        }
    }
    public void maxOfThreeNumbersTest8 (){
        int firstNumber = 4;
        int secondNumber = 8;
        int thirdNumber = 8;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result < secondNumber && secondNumber == thirdNumber){
            System.out.println("MaxOfThreeNumbersTest8 is Ok, second and third numbers are highest");
        }else{
            System.out.println("MaxOfThreeNumbersTest8 is failed");
        }
    }
    public void maxOfThreeNumbersTest9 (){
        int firstNumber = 8;
        int secondNumber = 4;
        int thirdNumber = 8;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result < firstNumber && firstNumber == thirdNumber){
            System.out.println("MaxOfThreeNumbersTest9 is Ok, first and third numbers are highest");
        }else{
            System.out.println("MaxOfThreeNumbersTest9 is failed");
        }
    }
    public void maxOfThreeNumbersTest10 (){
        int firstNumber = 8;
        int secondNumber = 8;
        int thirdNumber = 8;
        Calculator myCalculator = new Calculator();
        int result = myCalculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber && result == firstNumber){
            System.out.println("MaxOfThreeNumbersTest10 is Ok, first and third numbers are highest");
        }else{
            System.out.println("MaxOfThreeNumbersTest10 is failed");
        }
    }
}

