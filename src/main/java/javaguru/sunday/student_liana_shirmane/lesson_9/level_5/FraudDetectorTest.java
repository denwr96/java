package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task29
@CodeReview(approved = true)
public class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.FraudRule1();
        test.FraudRule2();
        test.FraudRule3();
        test.FraudRule4();
        test.FraudRule5();
    }

    public FraudRule[] fillFraudRules() {
        FraudRule[] fraudRules = new FraudRule[5];
        fraudRules[0] = new FraudRule1("ruleName");
        fraudRules[1] = new FraudRule2("ruleAmount");
        fraudRules[2] = new FraudRule3("ruleCity");
        fraudRules[3] = new FraudRule4("ruleCountry");
        fraudRules[4] = new FraudRule5("ruleAmountAndCountry");
        return fraudRules;
    }

    public void FraudRule1() {
        Trader test = new Trader("Pokemon", "Riga", "Latvia");
        Transaction t = new Transaction(test, 100);
        FraudDetector victim = new FraudDetector(fillFraudRules());
        boolean actualResult = victim.isFraud(t);
        check(actualResult, "Fraud for Rule1");
    }


    public void FraudRule2() {
        Trader test = new Trader("Ben Lee", "Riga", "Latvia");
        Transaction t = new Transaction(test, 1000001);
        FraudDetector victim = new FraudDetector(fillFraudRules());
        boolean actualResult = victim.isFraud(t);
        check(actualResult, "Fraud for Rule2");
    }

    public void FraudRule3() {
        Trader test = new Trader("Ben Lee", "Sidney", "Australia");
        Transaction t = new Transaction(test, 100);
        FraudDetector victim = new FraudDetector(fillFraudRules());
        boolean actualResult = victim.isFraud(t);
        check(actualResult, "Fraud for Rule3");
    }

    public void FraudRule4() {
        Trader test = new Trader("Ben Lee", "Kingston","Jamaica");
        Transaction t = new Transaction(test, 1000000);
        FraudDetector victim = new FraudDetector(fillFraudRules());
        boolean actualResult = victim.isFraud(t);
        check(actualResult, "Fraud for Rule4");
    }

    public void FraudRule5() {
        Trader test = new Trader("Ben Lee", "Berlin","Germany");
        Transaction t = new Transaction(test, 1001);
        FraudDetector victim = new FraudDetector(fillFraudRules());
        boolean actualResult = victim.isFraud(t);
        check(actualResult, "Fraud for Rule5");
    }


    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
