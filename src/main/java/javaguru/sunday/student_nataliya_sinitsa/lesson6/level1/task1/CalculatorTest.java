package javaguru.sunday.student_nataliya_sinitsa.lesson6.level1.task1;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
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

}
