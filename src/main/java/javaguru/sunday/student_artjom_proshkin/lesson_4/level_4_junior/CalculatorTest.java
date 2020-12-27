package javaguru.sunday.student_artjom_proshkin.lesson_4.level_4_junior;

// Task_12
// Task_13
// Task_14
// Task_15

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Довольно много тестов ) Жаль, что не вынисли в отдельный метод check, как я показывал на уроке. Кода было бы на мнооого меньше")
class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.multiplyTest();
        calculatorTest.subtractTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersIsFirstNumberTest();
        calculatorTest.maxOfTwoNumbersIsSecondNumberTest();
        calculatorTest.twoNumbersAreEqualTest();
        calculatorTest.maxOfThreeNumbersIsFirstNumberTest();
        calculatorTest.maxOfThreeNumbersIsSecondNumberTest();
        calculatorTest.maxOfThreeNumbersIsThirdNumberTest();
        calculatorTest.maxOfThreeNumbersIfFirstAndSecondNumbersAreEqualTest();
        calculatorTest.maxOfThreeNumbersIfSecondAndThirdNumbersAreEqualTest();
        calculatorTest.maxOfThreeNumbersIfFirstAndThirdNumbersAreEqualTest();
        calculatorTest.threeNumbersAreEqualTest();
    }

    void sumTest(){
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

    void multiplyTest(){
        int firstNumber = 5;
        int secondNumber = 6;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(firstNumber, secondNumber);
        if (result == 30) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }
    void subtractTest(){
        int firstNumber = 5;
        int secondNumber = 6;
        Calculator calculator = new Calculator();
        int result = calculator.subtract(firstNumber, secondNumber);
        if (result == -1) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }
    void divideTest(){
        int firstNumber = 6;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.divide(firstNumber, secondNumber);
        if (result == 3) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }
    void isEvenTest(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(2);
        if (result){
            System.out.println("IsEvenTest = OK");
        } else {
            System.out.println("IsEvenTest = FAIL");
        }

    }
    void maxOfTwoNumbersIsFirstNumberTest (){
        int firstNumber = 25;
        int secondNumber = 20;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (result == 25){
            System.out.println("maxOfTwoNumbersIsFirstNumberTest = OK");
        } else {
            System.out.println("maxOfTwoNumbersIsFirstNumberTest = FAIL");
        }
    }
    void maxOfTwoNumbersIsSecondNumberTest (){
        int firstNumber = 25;
        int secondNumber = 50;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (result == 50){
            System.out.println("maxOfTwoNumbersIsSecondNumberTest = OK");
        } else {
            System.out.println("maxOfTwoNumbersIsSecondNumberTest = FAIL");
        }
    }
    void twoNumbersAreEqualTest (){
        int firstNumber = 25;
        int secondNumber = 25;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (result == 25){
            System.out.println("twoNumbersAreEqualTest = OK");
        } else {
            System.out.println("twoNumbersAreEqualTest = FAIL");
        }
    }
    void maxOfThreeNumbersIsFirstNumberTest () {
        int firstNumber = 9;
        int secondNumber = 6;
        int thirdNumber = 7;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 9){
            System.out.println("maxOfThreeNumbersIsFirstNumberTest = OK");
        } else {
            System.out.println("maxOfThreeNumbersIsFirstNumberTest = FAIL");
        }
    }
    void maxOfThreeNumbersIsSecondNumberTest () {
        int firstNumber = 5;
        int secondNumber = 18;
        int thirdNumber = 7;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 18){
            System.out.println("maxOfThreeNumbersIsSecondNumberTest = OK");
        } else {
            System.out.println("maxOfThreeNumbersIsSecondNumberTest = FAIL");
        }
    }
    void maxOfThreeNumbersIsThirdNumberTest () {
        int firstNumber = 4;
        int secondNumber = 8;
        int thirdNumber = 17;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 17){
            System.out.println("maxOfThreeNumbersIsThirdNumberTest = OK");
        } else {
            System.out.println("maxOfThreeNumbersIsThirdNumberTest = FAIL");
        }
    }
    void maxOfThreeNumbersIfFirstAndSecondNumbersAreEqualTest () {
        int firstNumber = 9;
        int secondNumber = 9;
        int thirdNumber = 17;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 17){
            System.out.println("maxOfThreeNumbersIfFirstAndSecondNumbersAreEqualTest = OK");
        } else {
            System.out.println("maxOfThreeNumbersIfFirstAndSecondNumbersAreEqualTest = FAIL");
        }
    }
    void maxOfThreeNumbersIfSecondAndThirdNumbersAreEqualTest () {
        int firstNumber = 9;
        int secondNumber = 7;
        int thirdNumber = 7;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 9){
            System.out.println("maxOfThreeNumbersIfSecondAndThirdNumbersAreEqualTest = OK");
        } else {
            System.out.println("maxOfThreeNumbersIfSecondAndThirdNumbersAreEqualTest = FAIL");
        }
    }
    void maxOfThreeNumbersIfFirstAndThirdNumbersAreEqualTest () {
        int firstNumber = 7;
        int secondNumber = 8;
        int thirdNumber = 7;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 8){
            System.out.println("maxOfThreeNumbersIfFirstAndThirdNumbersAreEqualTest = OK");
        } else {
            System.out.println("maxOfThreeNumbersIfFirstAndThirdNumbersAreEqualTest = FAIL");
        }
    }
    void threeNumbersAreEqualTest () {
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 7;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 7){
            System.out.println("maxOfThreeNumbersIfFirstAndThirdNumbersAreEqualTest = OK");
        } else {
            System.out.println("maxOfThreeNumbersIfFirstAndThirdNumbersAreEqualTest = FAIL");
        }
    }
}
