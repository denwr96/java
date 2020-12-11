package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.powerCalculatorTest1();
        test.powerCalculatorTest2();
        test.powerCalculatorTest3();
        test.powerCalculatorTest4();

    }
    public void powerCalculatorTest1(){
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.powerCalculator(2,4);
        double expectedResult = 16;
        testResult(actualResult, expectedResult, "PowerCalculatorTest1");
    }

    public void powerCalculatorTest2(){
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.powerCalculator(2,0);
        double expectedResult = 1;
        testResult(actualResult, expectedResult, "PowerCalculatorTest2");
    }

    public void powerCalculatorTest3(){
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.powerCalculator(2,-3);
        double expectedResult = 0.125;
        testResult(actualResult, expectedResult, "PowerCalculatorTest3");
    }

    public void powerCalculatorTest4(){
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.powerCalculator(0,-3);
        double expectedResult = 0;
        testResult(actualResult, expectedResult, "PowerCalculatorTest4");
    }

    public void testResult(double actualResult, double expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
