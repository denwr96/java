package javaguru.sunday.student_deniss_lobacs.lesson_7.level_6_middle.task10;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PowerCalculatorTest {
    public static void main(String[] args) {
      PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.testShouldBeOk1();
        powerCalculatorTest.testShouldBeOk2();
        powerCalculatorTest.testShouldBeOk3();
        powerCalculatorTest.testShouldBeFail1();
    }

    public void testShouldBeOk1(){
        PowerCalculator test = new PowerCalculator();
        check(test.exponentiation(1, 10), 1, "Test1");
    }

    public void testShouldBeOk2(){
        PowerCalculator test = new PowerCalculator();
        check(test.exponentiation(2, 10), 1024, "Test1");
    }

    public void testShouldBeOk3(){
        PowerCalculator test = new PowerCalculator();
        check(test.exponentiation(10, 0), 1, "Test1");
    }

    public void testShouldBeFail1(){
        PowerCalculator test = new PowerCalculator();
        check(test.exponentiation(2, 2), 8, "Test1");
    }

    public void check(double actualResult, double expectedResult, String testName){
        if (actualResult == expectedResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }
}
