package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_10;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.PowerCalculatorTesting();

    }
    public void PowerCalculatorTesting(){
        PowerCalculator victim = new PowerCalculator();
        int actualResult = victim.PowerCalculator(2,4);
        int expectedResult = 16;
        testResult(actualResult, expectedResult, "PowerCalculatorTest");
    }

    public void testResult(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
