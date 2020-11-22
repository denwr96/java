package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_6.level_1.task_1;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.isEvenTest1();
        test.isEvenTest2();
    }
    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(18);
        check(actualResult, "Test 1");
    }
    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " Passed");
        } else {
            System.out.println(testName + " Failed");
        }
    }
    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean newResult = calculator.isEven2(12);
        check(newResult, "Test 2");
    }
    public void check(boolean newResult, boolean actualResult, String testName) {
        if (newResult == actualResult) {
            System.out.println(testName + " Passed");
        } else {
            System.out.println(testName + " Failed");
        }
    }

}
