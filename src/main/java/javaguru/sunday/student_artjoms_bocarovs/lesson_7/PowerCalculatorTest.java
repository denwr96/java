package javaguru.sunday.student_artjoms_bocarovs.lesson_7;

public class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.firstTestShouldPass();
        powerCalculatorTest.secondTestShouldPass();
        powerCalculatorTest.thirdTestShouldPass();
        powerCalculatorTest.fourthTestShouldFail();
    }

    public void firstTestShouldPass(){
        PowerCalculator test = new PowerCalculator();
        check(test.exponentiation(1, 10), 1, "First Test");
    }

    public void secondTestShouldPass(){
        PowerCalculator test = new PowerCalculator();
        check(test.exponentiation(2, 10), 1024, "Second Test");
    }

    public void thirdTestShouldPass(){
        PowerCalculator test = new PowerCalculator();
        check(test.exponentiation(10, 0), 1, "Third Test");
    }

    public void fourthTestShouldFail(){
        PowerCalculator test = new PowerCalculator();
        check(test.exponentiation(2, 2), 8, "Fourth Test");
    }

    public void check(double actualResult, double expectedResult, String testName){
        if (actualResult == expectedResult) {
            System.out.println(testName + " SUCCESS!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }
}
