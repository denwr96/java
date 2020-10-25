package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_7_senior.super_task_3;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest(){
        int firstNumber = 60;
        int secondNumber = 30;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        checkResult(result == 90, "sumTest");
    }

    public void subTest(){
        int firstNumber = 60;
        int secondNumber = 30;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        checkResult(result == 30, "subTest");
    }

    public void mulTest(){
        int firstNumber = 15;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        checkResult(result == 30, "mulTest");
    }

    public void divTest(){
        int firstNumber = 30;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        checkResult(result == 15, "divTest");
    }

    public void isEvenTest1(){
        int number = 2;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        checkResult(result, "isEvenTest1");
    }

    public void isEvenTest2(){
        int number = 3;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        checkResult(!result, "isEvenTest2");
    }

    public void checkResult(boolean condition, String testName){
        if(condition){
            System.out.println(testName + " OK!");
        } else  {
            System.out.println(testName + " FAIL!");
        }
    }
}
