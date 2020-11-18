package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_10;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.PowerCalculatorTest1();
        test.PowerCalculatorTest2();
        test.PowerCalculatorTest3();
        test.PowerCalculatorTest4();

    }
    public void PowerCalculatorTest1(){
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.PowerCalculator(2,4);
        double expectedResult = 16;
        testResult(actualResult, expectedResult, "PowerCalculatorTest1");
    }

    public void PowerCalculatorTest2(){
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.PowerCalculator(2,0);
        double expectedResult = 1;
        testResult(actualResult, expectedResult, "PowerCalculatorTest2");
    }

    public void PowerCalculatorTest3(){
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.PowerCalculator(2,-3);
        double expectedResult = 0.125;
        testResult(actualResult, expectedResult, "PowerCalculatorTest3");
    }

    public void PowerCalculatorTest4(){
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.PowerCalculator(0,-3);
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
