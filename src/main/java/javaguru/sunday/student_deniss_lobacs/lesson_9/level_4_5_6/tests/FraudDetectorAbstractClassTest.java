package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6.tests;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6.*;

// task22, task23, task24, task25, task26, task27, task28;
public class FraudDetectorAbstractClassTest {
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
        Transaction transaction = new Transaction();
        Trader trader = transaction.getTrader();
        trader.setFullName("Pokemon");
        FraudRule1 fraudRule1 = new FraudRule1("1st Rule");
        boolean expectedResult = true;
        boolean actualResult = fraudRule1.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByNameShouldReturnTrue");
    }

    public void testFraudDetectorByNameShouldReturnFalse() {
        Transaction transaction = new Transaction();
        Trader trader = transaction.getTrader();
        trader.setFullName("Pikachu");
        FraudRule1 fraudRule1 = new FraudRule1("1st Rule");
        boolean expectedResult = false;
        boolean actualResult = fraudRule1.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByNameShouldReturnFalse");
    }

    public void testFraudDetectorByAmountShouldReturnTrue() {
        Transaction transaction = new Transaction();
        transaction.setAmount(1100000);
        FraudRule2 fraudRule2 = new FraudRule2("2nd Rule");
        boolean expectedResult = true;
        boolean actualResult = fraudRule2.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByAmountShouldReturnTrue");
    }

    public void testFraudDetectorByAmountShouldReturnFalse() {
        Transaction transaction = new Transaction();
        transaction.setAmount(100000);
        FraudRule2 fraudRule2 = new FraudRule2("2nd Rule");
        boolean expectedResult = false;
        boolean actualResult = fraudRule2.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByAmountShouldReturnFalse");
    }

    public void testFraudDetectorByCityShouldReturnTrue() {
        Transaction transaction = new Transaction();
        Trader trader = transaction.getTrader();
        trader.setCity("Sydney");
        FraudRule3 fraudRule3 = new FraudRule3("3th Rule");
        boolean expectedResult = true;
        boolean actualResult = fraudRule3.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCityShouldReturnTrue");
    }

    public void testFraudDetectorByCityShouldReturnFalse() {
        Transaction transaction = new Transaction();
        Trader trader = transaction.getTrader();
        trader.setCity("Riga");
        FraudRule3 fraudRule3 = new FraudRule3("3th Rule");
        boolean expectedResult = false;
        boolean actualResult = fraudRule3.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCityShouldReturnFalse");
    }

    public void testFraudDetectorByCountryShouldReturnTrue() {
        Transaction transaction = new Transaction();
        Trader trader = transaction.getTrader();
        trader.setCountry("Jamaica");
        FraudRule4 fraudRule4 = new FraudRule4("4th Rule");
        boolean expectedResult = true;
        boolean actualResult = fraudRule4.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnTrue");
    }

    public void testFraudDetectorByCountryShouldReturnFalse() {
        Transaction transaction = new Transaction();
        Trader trader = transaction.getTrader();
        trader.setCountry("Germany");
        FraudRule4 fraudRule4 = new FraudRule4("4th Rule");
        boolean expectedResult = false;
        boolean actualResult = fraudRule4.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnFalse");
    }

    public void testFraudDetectorByCountryAndAmountShouldReturnTrue() {
        Transaction transaction = new Transaction();
        Trader trader = transaction.getTrader();
        trader.setCountry("Germany");
        transaction.setAmount(100000);
        FraudRule5 fraudRule5 = new FraudRule5("5th Rule");
        boolean expectedResult = true;
        boolean actualResult = fraudRule5.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnTrue");
    }

    public void testFraudDetectorByCountryAndAmountShouldReturnFalse1() {
        Transaction transaction = new Transaction();
        Trader trader = transaction.getTrader();
        trader.setCountry("Germany");
        transaction.setAmount(50);
        FraudRule5 fraudRule5 = new FraudRule5("5th Rule");
        boolean expectedResult = false;
        boolean actualResult = fraudRule5.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnFalse1");
    }

    public void testFraudDetectorByCountryAndAmountShouldReturnFalse2() {
        Transaction transaction = new Transaction();
        Trader trader = transaction.getTrader();
        trader.setCountry("Russia");
        transaction.setAmount(1000000);
        FraudRule5 fraudRule5 = new FraudRule5("5th Rule");
        boolean expectedResult = false;
        boolean actualResult = fraudRule5.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnFalse2");
    }

    public void testFraudDetectorByCountryAndAmountShouldReturnFalse3() {
        Transaction transaction = new Transaction();
        Trader trader = transaction.getTrader();
        trader.setCountry("Latvia");
        transaction.setAmount(100);
        FraudRule5 fraudRule5 = new FraudRule5("5th Rule");
        boolean expectedResult = false;
        boolean actualResult = fraudRule5.isFraud(transaction);
        check(expectedResult , actualResult , "testFraudDetectorByCountryShouldReturnFalse3");
    }

    public void check(boolean actualResult,boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
