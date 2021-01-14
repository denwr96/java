package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_26
@CodeReview(approved = true)
class FraudRule3Test {

    public static void main(String[] args) {
        FraudRule3Test test = new FraudRule3Test();
        test.transactionFromSydneyTest();
        test.transactionNotFromSydneyTest();
    }

    FraudRule3 victim = new FraudRule3("SydneyFraud");

    void transactionFromSydneyTest() {
        Trader testTrader = new Trader("Hugh", "Sydney", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 50);
        checkResult(victim.isFraud(testTransaction), "transactionFromSydneyTest");
    }

    void transactionNotFromSydneyTest() {
        Trader testTrader = new Trader("Hugh", "Canberra", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 50);
        checkResult(!victim.isFraud(testTransaction), "transactionNotFromSidneyTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
