//package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5.v2;
//
//// Task 29 (level 5)
//
//class FraudDetectorTestPrevVersion {
//
//    public static void main(String[] args) {
//        FraudDetectorTestPrevVersion FraudDetectorTestPrevVersion = new FraudDetectorTestPrevVersion();
//        FraudDetectorTestPrevVersion.fraudDetectorRule1Test();
//        FraudDetectorTestPrevVersion.fraudDetectorRule2Test();
//        FraudDetectorTestPrevVersion.fraudDetectorRule3Test();
//        FraudDetectorTestPrevVersion.fraudDetectorRule4Test();
//        FraudDetectorTestPrevVersion.fraudDetectorRule5Test();
//    }
//
//    FraudDetector fraudDetector = new FraudDetector();
//
//    void fraudDetectorRule1Test() {
//        Trader trader = new Trader("Pokemon", "Tokyo");
//        Transaction transaction = new Transaction(trader, 100);
//        checkResults(fraudDetector.isFraud(transaction), "'Pokemon' fraud detector rule 1 test");
//    }
//
//    void fraudDetectorRule2Test() {
//        Trader trader = new Trader("Kojima", "Tokyo");
//        Transaction transaction = new Transaction(trader, 1000001);
//        checkResults(fraudDetector.isFraud(transaction), "'> 1 000 000' fraud detector rule 2 test");
//    }
//
//    void fraudDetectorRule3Test() {
//        Trader trader = new Trader("Kenguroff", "Sydney");
//        Transaction transaction = new Transaction(trader, 10000);
//        checkResults(fraudDetector.isFraud(transaction), "'Sydney' fraud detector rule 3 test");
//    }
//
//    void fraudDetectorRule4Test() {
//        Trader trader = new Trader("Jamaica");
//        Transaction transaction = new Transaction(trader, 10000);
//        checkResults(fraudDetector.isFraud(transaction), "'Jamaica' fraud detector rule 4 test");
//    }
//
//    void fraudDetectorRule5Test() {
//        Trader trader = new Trader("Germany");
//        Transaction transaction = new Transaction(trader, 1001);
//        checkResults(fraudDetector.isFraud(transaction), "'Germany & > 1000' fraud detector rule 5 test");
//    }
//
//    public boolean checkResults(boolean condition, String testName) {
//        if (condition) {
//            System.out.println(testName + " = OK \n");
//            return condition;
//        } else {
//            System.out.println(testName + " = FAIL \n");
//            return !condition;
//        }
//    }
//
//}
