package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson7.level6.task10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.shouldRaiseNumberIntoPower1();
        test.shouldRaiseNumberIntoPower2();
        test.shouldRaiseNumberIntoPower3();
        test.shouldRaiseNumberIntoPower4();
        test.shouldRaiseNumberIntoPower5();
        test.shouldRaiseNumberIntoPower6();
        test.shouldRaiseNumberIntoPower7();
        test.shouldRaiseNumberIntoPower8();
        test.shouldRaiseNumberIntoPower9();
        test.shouldRaiseNumberIntoPower10();
        test.shouldRaiseNumberIntoPower11();
        test.shouldRaiseNumberIntoPower12();
        test.shouldRaiseNumberIntoPower13();
        test.shouldRaiseNumberIntoPower14();
    }

    public void shouldRaiseNumberIntoPower1() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(3, 3);
        check(actualResult == 27, "shouldRaiseThreeIntoPower1");
    }

    public void shouldRaiseNumberIntoPower2() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(3, 0);
        check(actualResult == 1, "shouldRaiseThreeIntoPower2");
    }

    public void shouldRaiseNumberIntoPower3() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(3, 1);
        check(actualResult == 3, "shouldRaiseThreeIntoPower3");
    }

    public void shouldRaiseNumberIntoPower4() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(1, 1);
        check(actualResult == 1, "shouldRaiseOneIntoPower1");
    }

    public void shouldRaiseNumberIntoPower5() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(1, 0);
        check(actualResult == 1, "shouldRaiseOneIntoPower2");
    }

    public void shouldRaiseNumberIntoPower6() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(0, 0);
        check(actualResult == 1, "shouldRaiseZeroIntoPower1");
    }

    public void shouldRaiseNumberIntoPower7() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(0, 1);
        check(actualResult == 0, "shouldRaiseZeroIntoPower2");
        System.out.println(" ");
    }

    public void shouldRaiseNumberIntoPower8() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(0, -1);
        check(actualResult == 0, "shouldRaiseZeroIntoNegativePower");
        System.out.println(" ");
    }

    public void shouldRaiseNumberIntoPower9() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(1, -3);
        check(actualResult == 1, "shouldRaiseOneIntoNegativePower");
    }

    public void shouldRaiseNumberIntoPower10() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(5, -2);
        check(actualResult == 0.04, "shouldRaiseFiveIntoNegativePower");
    }

    public void shouldRaiseNumberIntoPower11() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(2, -3);
        check(actualResult == 0.125, "shouldRaiseTwoIntoNegativePower");
    }

    public void shouldRaiseNumberIntoPower12() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(0.5, 2);
        check(actualResult == 0.25, "shouldRaiseDoubleIntoPower");
    }

    public void shouldRaiseNumberIntoPower13() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(0.5, 0);
        check(actualResult == 1, "shouldRaiseDoubleIntoZeroPower");
    }

    public void shouldRaiseNumberIntoPower14() {
        PowerCalculator victim = new PowerCalculator();
        double actualResult = victim.numberIntoPower(0.04, -2);
        check(actualResult == 625, "shouldRaiseDoubleIntoNegativePower");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
