package javaguru.sunday.student_deniss_lenenkov.lesson_4.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        CalculatorTest.sumTest();
        CalculatorTest.subTest();
        CalculatorTest.divTest();
        CalculatorTest.multTest();
        CalculatorTest.isEvenTest();
        CalculatorTest.maxTest1();
        CalculatorTest.maxTest2();
        CalculatorTest.maxTest3();
        CalculatorTest.maxOfThreeNumbers1();
        CalculatorTest.maxOfThreeNumbers2();
        CalculatorTest.maxOfThreeNumbers3();
        CalculatorTest.maxOfThreeNumbers4();
        CalculatorTest.maxOfThreeNumbers5();
        CalculatorTest.maxOfThreeNumbers6();
        CalculatorTest.maxOfThreeNumbers7();
    }

    static void sumTest() {
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
    static void subTest() {
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
    static void divTest() {
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
    static void multTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mult(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Mult test = OK");
        } else {
            System.out.println("Mult test = FAIL");
        }
    }
    static void isEvenTest(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(8);
        if (result){
            System.out.println("IsEven test = OK ");
        }else{
            System.out.println("IsEven test = FAIL");
        }
    }

    static void maxTest1(){

        int numberOne = 10;
        int numberTwo = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(numberOne , numberTwo);
        if (result == 10){
            System.out.println("Max Test 1 = OK");
        }else{
            System.out.println("Max Test 1 = FAIL");
        }

    }
    static void maxTest2(){

        int numberOne = 5;
        int numberTwo = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(numberOne , numberTwo);
        if (result == 10){
            System.out.println("Max test 2 = OK");
        }else{
            System.out.println("Max test 2 = FAIL");
        }

    }
    static void maxTest3(){

        int numberOne = 10;
        int numberTwo = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(numberOne , numberTwo);
        if (result == 10){
            System.out.println("Max test 3 = OK");
        }else{
            System.out.println("Max test 3 = FAIL");
        }

    }
    static void maxOfThreeNumbers1(){
        int numberOne = 50;
        int numberTwo = 40;
        int numberThree = 30;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(numberOne , numberTwo , numberThree);
        if(result == 50){
            System.out.println("MaX of Three Numbers Test 1 = OK");
        }else{
            System.out.println("Max of Three Numbers Test 1 = FAIL");
        }
    }

    static void maxOfThreeNumbers2(){
        int numberOne = 40;
        int numberTwo = 50;
        int numberThree = 30;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(numberOne , numberTwo , numberThree);
        if(result == 50){
            System.out.println("MaX of Three Numbers Test 2 = OK");
        }else{
            System.out.println("Max of Three Numbers Test 2 = FAIL");
        }
    }

    static void maxOfThreeNumbers3(){
        int numberOne = 30;
        int numberTwo = 40;
        int numberThree = 50;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(numberOne , numberTwo , numberThree);
        if(result == 50){
            System.out.println("MaX of Three Numbers Test 3 = OK");
        }else{
            System.out.println("Max of Three Numbers Test 3 = FAIL");
        }
    }

    static void maxOfThreeNumbers4(){
        int numberOne = 50;
        int numberTwo = 50;
        int numberThree = 30;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(numberOne , numberTwo , numberThree);
        if(result == 50){
            System.out.println("MaX of Three Numbers Test 4 = OK");
        }else{
            System.out.println("Max of Three Numbers Test 4 = FAIL");
        }
    }

    static void maxOfThreeNumbers5(){
        int numberOne = 50;
        int numberTwo = 30;
        int numberThree = 50;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(numberOne , numberTwo , numberThree);
        if(result == 50){
            System.out.println("MaX of Three Numbers Test 5 = OK");
        }else{
            System.out.println("Max of Three Numbers Test 5 = FAIL");
        }
    }

    static void maxOfThreeNumbers6(){
        int numberOne = 30;
        int numberTwo = 50;
        int numberThree = 50;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(numberOne , numberTwo , numberThree);
        if(result == 50){
            System.out.println("MaX of Three Numbers Test 6 = OK");
        }else{
            System.out.println("Max of Three Numbers Test 6 = FAIL");
        }
    }

    static void maxOfThreeNumbers7(){
        int numberOne = 50;
        int numberTwo = 50;
        int numberThree = 50;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(numberOne , numberTwo , numberThree);
        if(result == 50){
            System.out.println("MaX of Three Numbers Test 7 = OK");
        }else{
            System.out.println("Max of Three Numbers Test 7 = FAIL");
        }
    }



}
