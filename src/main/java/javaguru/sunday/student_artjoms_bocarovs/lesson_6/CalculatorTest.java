package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_6;


public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenFirstTest();
        calculatorTest.isEvenSecondTest();
    }

    private void isEvenFirstTest() {
        int number = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result){
            System.out.println("Test pass");
        } else {
            System.out.println("Test fail");
        }

    }

    private void isEvenSecondTest() {
        int number = 7;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (!result) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test fail");
        }
    }

}

