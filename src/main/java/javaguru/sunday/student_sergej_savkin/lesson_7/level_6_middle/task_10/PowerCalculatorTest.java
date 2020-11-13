package main.java.javaguru.sunday.student_sergej_savkin.lesson_7.level_6_middle.task_10;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.raiseNumberToPowerTest();
    }

    public void raiseNumberToPowerTest(){
        PowerCalculator test = new PowerCalculator();
        check(test.raiseNumberToPower(3, 3), 9, "raiseNumberToPowerTest");
    }

    public void check(int actualResult, int expectedResult, String testName){
        if (actualResult == expectedResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
