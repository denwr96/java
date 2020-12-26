package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 33 (level 6)
@CodeReview(approved = true)
class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.fraudDetectorRule1Test();
        fraudDetectorTest.fraudDetectorRule2Test();
        fraudDetectorTest.fraudDetectorRule3Test();
        fraudDetectorTest.fraudDetectorRule4Test();
        fraudDetectorTest.fraudDetectorRule5Test();
    }

    FraudDetector fraudDetector = new FraudDetector();

    void fraudDetectorRule1Test() {
        Trader trader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 100);
        checkResults((fraudDetector.isFraud(transaction).toString()).equals("FraudDetectionResult{fraud=true, ruleName='Rule 1, 'Pokemon''}"), "'Pokemon' fraud detector rule 1 test");
    }

    void fraudDetectorRule2Test() {
        Trader trader = new Trader("Kojima", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000001);
        checkResults((fraudDetector.isFraud(transaction).toString()).equals("FraudDetectionResult{fraud=true, ruleName='Rule 2, '> 1 000 000''}"), "'> 1 000 000' fraud detector rule 2 test");
    }

    void fraudDetectorRule3Test() {
        Trader trader = new Trader("Kenguroff", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        checkResults((fraudDetector.isFraud(transaction).toString()).equals("FraudDetectionResult{fraud=true, ruleName='Rule 3, 'Sydney''}"), "'Sydney' fraud detector rule 3 test");
    }

    void fraudDetectorRule4Test() {
        Trader trader = new Trader("Bob Marley", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 10000);
        checkResults((fraudDetector.isFraud(transaction).toString()).equals("FraudDetectionResult{fraud=true, ruleName='Rule 4, 'Jamaica''}"), "'Jamaica' fraud detector rule 4 test");
    }

    void fraudDetectorRule5Test() {
        Trader trader = new Trader("Kolodzej", "Hamburg", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        checkResults((fraudDetector.isFraud(transaction).toString()).equals("FraudDetectionResult{fraud=true, ruleName='Rule 5, 'Germany & > 1000''}"), "'Germany & > 1000' fraud detector rule 5 test");
    }

    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK \n");
        } else {
            System.out.println(testName + " = FAIL \n");
        }
    }

}
