package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// lesson_9 task_17
// lesson_9 task_18
// lesson_9 task_19
// lesson_9 task_20
// lesson_9 task_21
// lesson_9 task_22
// lesson_9 task_23
// lesson_9 task_24
// lesson_9 task_25
// lesson_9 task_26
// lesson_9 task_27
// lesson_9 task_28
// lesson_9 task_29
// lesson_9 task_30
// lesson_9 task_31
// lesson_9 task_32
// lesson_9 task_33
@CodeReview(approved = true)
class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.isFraudTest1();
        test.isFraudTest2();
        test.isFraudTest3();
        test.isFraudTest4();
        test.isFraudTest5();
        test.isFraudTest6();
        test.isFraudTest7();
    }

    public void isFraudTest1 (){
        Trader myTrader = new Trader("Pokemon", "Latvia", "Riga");
        Transaction myTransaction = new Transaction(myTrader, 100);
        FraudDetector victim = new FraudDetector();
        FraudDetectionResult result = victim.isFraud(myTransaction);
        testResult(result.isFraud(), "isFraudTest1");
    }

    public void isFraudTest2 (){
        Trader myTrader = new Trader("John", "Latvia", "Riga");
        Transaction myTransaction = new Transaction(myTrader, 1000000);
        FraudDetector victim = new FraudDetector();
        FraudDetectionResult result = victim.isFraud(myTransaction);
        testResult(result.isFraud(), "isFraudTest2");
    }

    public void isFraudTest3 (){
        Trader myTrader = new Trader("John", "Australia", "Sydney");
        Transaction myTransaction = new Transaction(myTrader, 1000);
        FraudDetector victim = new FraudDetector();
        FraudDetectionResult result = victim.isFraud(myTransaction);
        testResult(result.isFraud(), "isFraudTest3");
    }

    public void isFraudTest4 (){
        Trader myTrader = new Trader("John", "Jamaica", "Kingston");
        Transaction myTransaction = new Transaction(myTrader, 1000);
        FraudDetector victim = new FraudDetector();
        FraudDetectionResult result = victim.isFraud(myTransaction);
        testResult(result.isFraud(), "isFraudTest4");
    }

    public void isFraudTest5 (){
        Trader myTrader = new Trader("John", "Germany", "Bremen");
        Transaction myTransaction = new Transaction(myTrader, 1000);
        FraudDetector victim = new FraudDetector();
        FraudDetectionResult result = victim.isFraud(myTransaction);
        testResultV2(result.isFraud(), "isFraudTest5");
    }

    public void isFraudTest6 (){
        Trader myTrader = new Trader("John", "Germany", "Berlin");
        Transaction myTransaction = new Transaction(myTrader, 1001);
        FraudDetector victim = new FraudDetector();
        FraudDetectionResult result = victim.isFraud(myTransaction);
        testResult(result.isFraud(), "isFraudTest6");
    }

    public void isFraudTest7 (){
        Trader myTrader = new Trader("John", "Sweden", "Stockholm");
        Transaction myTransaction = new Transaction(myTrader, 3000);
        FraudDetector victim = new FraudDetector();
        FraudDetectionResult result = victim.isFraud(myTransaction);
        testResultV2(result.isFraud(), "isFraudTest7");
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }

    public void testResultV2(boolean result, String testName) {
        if (!result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
