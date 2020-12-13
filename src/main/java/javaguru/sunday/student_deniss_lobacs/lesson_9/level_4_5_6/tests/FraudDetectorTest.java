package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6.tests;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6.*;

// task17, task18, task19, task20, task21;
public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.testFraudDetectorByNameShouldReturnTrue();
        fraudDetectorTest.testFraudDetectorByNameShouldReturnFalse();
        fraudDetectorTest.testFraudDetectorByAmountShouldReturnTrue();
        fraudDetectorTest.testFraudDetectorByAmountShouldReturnFalse();
        fraudDetectorTest.testFraudDetectorByCityShouldReturnTrue();
        fraudDetectorTest.testFraudDetectorByCityShouldReturnFalse();
        fraudDetectorTest.testFraudDetectorByCountryShouldReturnTrue();
        fraudDetectorTest.testFraudDetectorByCountryShouldReturnFalse();
        fraudDetectorTest.testFraudDetectorByCountryAndAmountShouldReturnTrue();
        fraudDetectorTest.testFraudDetectorByCountryAndAmountShouldReturnFalse1();
        fraudDetectorTest.testFraudDetectorByCountryAndAmountShouldReturnFalse2();
        fraudDetectorTest.testFraudDetectorByCountryAndAmountShouldReturnFalse3();
    }

    public void testFraudDetectorByNameShouldReturnTrue() {
        Trader testTrader = new Trader("Pokemon" , "Riga" , "Latvia");
        Transaction transaction = new Transaction(testTrader,100);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = true;
        boolean actualResult = victim.isFraud1(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByNameShouldReturnFalse");
    }

    public void testFraudDetectorByNameShouldReturnFalse() {
        Trader testTrader = new Trader("Alex" , "Riga" , "Latvia");
        Transaction transaction = new Transaction(testTrader,100);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = false;
        boolean actualResult = victim.isFraud1(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByNameShouldReturnFalse");
    }

    public void testFraudDetectorByAmountShouldReturnTrue() {
        Trader testTrader = new Trader("Alex" , "Riga" , "Latvia");
        Transaction transaction = new Transaction(testTrader,100000000);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = true;
        boolean actualResult = victim.isFraud2(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByAmountShouldReturnTrue");
    }

    public void testFraudDetectorByAmountShouldReturnFalse() {
        Trader testTrader = new Trader("Alex" , "Riga" , "Latvia");
        Transaction transaction = new Transaction(testTrader,100);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = false;
        boolean actualResult = victim.isFraud2(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByAmountShouldReturnFalse");
    }

    public void testFraudDetectorByCityShouldReturnTrue() {
        Trader testTrader = new Trader("Alex" , "Sydney" , "Latvia");
        Transaction transaction = new Transaction(testTrader,100);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = true;
        boolean actualResult = victim.isFraud3(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCityShouldReturnTrue");
    }

    public void testFraudDetectorByCityShouldReturnFalse() {
        Trader testTrader = new Trader("Alex" , "Riga" , "Latvia");
        Transaction transaction = new Transaction(testTrader,100);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = false;
        boolean actualResult = victim.isFraud3(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCityShouldReturnFalse");
    }

    public void testFraudDetectorByCountryShouldReturnTrue() {
        Trader testTrader = new Trader("Alex" , "Riga" , "Jamaica");
        Transaction transaction = new Transaction(testTrader,100);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = true;
        boolean actualResult = victim.isFraud4(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnTrue");
    }

    public void testFraudDetectorByCountryShouldReturnFalse() {
        Trader testTrader = new Trader("Alex" , "Riga" , "Germany");
        Transaction transaction = new Transaction(testTrader,100);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = false;
        boolean actualResult = victim.isFraud4(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnFalse");
    }

    public void testFraudDetectorByCountryAndAmountShouldReturnTrue() {
        Trader testTrader = new Trader("Alex" , "Riga" , "Germany");
        Transaction transaction = new Transaction(testTrader,1000000000);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = true;
        boolean actualResult = victim.isFraud5(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnTrue");
    }

    public void testFraudDetectorByCountryAndAmountShouldReturnFalse1() {
        Trader testTrader = new Trader("Alex" , "Riga" , "Germany");
        Transaction transaction = new Transaction(testTrader,100);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = false;
        boolean actualResult = victim.isFraud5(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnFalse1");
    }

    public void testFraudDetectorByCountryAndAmountShouldReturnFalse2() {
        Trader testTrader = new Trader("Alex" , "Riga" , "Latvia");
        Transaction transaction = new Transaction(testTrader,1000000000);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = false;
        boolean actualResult = victim.isFraud5(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnFalse2");
    }

    public void testFraudDetectorByCountryAndAmountShouldReturnFalse3() {
        Trader testTrader = new Trader("Alex" , "Riga" , "Latvia");
        Transaction transaction = new Transaction(testTrader,100);
        FraudDetector victim = new FraudDetector();
        boolean expectedResult = false;
        boolean actualResult = victim.isFraud5(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnFalse3");
    }

    public void fillArray(FraudRule[] fraudRules) {
        fraudRules[0] = new FraudRule1("Rule1");
        fraudRules[1] = new FraudRule2("Rule2");
        fraudRules[2] = new FraudRule3("Rule3");
        fraudRules[3] = new FraudRule4("Rule4");
        fraudRules[4] = new FraudRule5("Rule5");
    }

    public void check(boolean actualResult,boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
