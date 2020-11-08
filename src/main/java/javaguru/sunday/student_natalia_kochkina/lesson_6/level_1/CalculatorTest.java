package main.java.javaguru.sunday.student_natalia_kochkina.lesson_6.level_1;

//Task_1

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        int number = 6;
        boolean actualResult = calculator.isEven(number);
        if (actualResult == true) {
            System.out.println("Test1 OK");
        } else {
            System.out.println("Test1 Failed");
        }
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        int number = 5;
        boolean actualResult = calculator.isEven(number);
        if (actualResult == false) {
            System.out.println("Test2 OK");
        } else {
            System.out.println("Test2 Failed");
        }
    }
}
