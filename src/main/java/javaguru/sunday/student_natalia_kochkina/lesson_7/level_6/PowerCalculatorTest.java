package javaguru.sunday.student_natalia_kochkina.lesson_7.level_6;

//Task_10

public class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.shouldRaisingANumberToAPower();
        powerCalculatorTest.shouldRaisingANumberToAPower2();
    }

    public void shouldRaisingANumberToAPower() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.raisingANumberToAPower(2,4);
        int expectedResult = 16;
        if (result == expectedResult) {
            System.out.println("Test1 OK");
        } else {
            System.out.println("Test1 Failed");
        }
    }

    public void shouldRaisingANumberToAPower2() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.raisingANumberToAPower(-3,2);
        int expectedResult = 9;
        if (result == expectedResult) {
            System.out.println("Test2 OK");
        } else {
            System.out.println("Test2 Failed");
        }
    }
}
