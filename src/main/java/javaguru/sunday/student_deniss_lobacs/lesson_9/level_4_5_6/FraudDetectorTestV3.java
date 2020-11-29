package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6;

// task33 tests;

public class FraudDetectorTestV3 {
    public static void main(String[] args) {
        FraudDetectorTestV3 fraudDetectorTestV3 = new FraudDetectorTestV3();
        fraudDetectorTestV3.testFraudDetectorShouldDetectRuleOne();
        fraudDetectorTestV3.testFraudDetectorShouldDetectRuleTwo();
        fraudDetectorTestV3.testFraudDetectorShouldDetectRuleThree();
        fraudDetectorTestV3.testFraudDetectorShouldDetectRuleFour();
        fraudDetectorTestV3.testFraudDetectorShouldDetectRuleFive();
        fraudDetectorTestV3.testFraudDetectorShouldNotDetectRules();
    }

    public void testFraudDetectorShouldDetectRuleOne() {
        Trader testTrader = new Trader("Pokemon", "Ogre", "Latvia");
        Transaction transaction = new Transaction(testTrader, 100);
        FraudDetector victim = new FraudDetector(fillArray());
        FraudDetectionResult actualResult = victim.isFraud(transaction);
        String expectedResult = "Rule1";
        check(actualResult, expectedResult, "testFraudDetectorShouldDetectRuleOne");
    }

    public void testFraudDetectorShouldDetectRuleTwo() {
        Trader testTrader = new Trader("Pikachu", "Ogre", "Latvia");
        Transaction transaction = new Transaction(testTrader, 10000000);
        FraudDetector victim = new FraudDetector(fillArray());
        FraudDetectionResult actualResult = victim.isFraud(transaction);
        String expectedResult = "Rule2";
        check(actualResult, expectedResult, "testFraudDetectorShouldDetectRuleTwo");
    }

    public void testFraudDetectorShouldDetectRuleThree() {
        Trader testTrader = new Trader("Pikachu", "Sydney", "Latvia");
        Transaction transaction = new Transaction(testTrader, 100);
        FraudDetector victim = new FraudDetector(fillArray());
        FraudDetectionResult actualResult = victim.isFraud(transaction);
        String expectedResult = "Rule3";
        check(actualResult, expectedResult, "testFraudDetectorShouldDetectRuleThree");
    }

    public void testFraudDetectorShouldDetectRuleFour() {
        Trader testTrader = new Trader("Pikachu", "Riga", "Jamaica");
        Transaction transaction = new Transaction(testTrader, 100);
        FraudDetector victim = new FraudDetector(fillArray());
        FraudDetectionResult actualResult = victim.isFraud(transaction);
        String expectedResult = "Rule4";
        check(actualResult, expectedResult, "testFraudDetectorShouldDetectRuleFour");
    }

    public void testFraudDetectorShouldDetectRuleFive() {
        Trader testTrader = new Trader("Pikachu", "Riga", "Germany");
        Transaction transaction = new Transaction(testTrader, 10000000);
        FraudDetector victim = new FraudDetector(fillArray());
        FraudDetectionResult actualResult = victim.isFraud(transaction);
        String expectedResult = "Rule5";
        check(actualResult, expectedResult, "testFraudDetectorShouldDetectRuleFive");
    }

    public void testFraudDetectorShouldNotDetectRules() {
        Trader testTrader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction transaction = new Transaction(testTrader, 100);
        FraudDetector victim = new FraudDetector(fillArray());
        FraudDetectionResult actualResult = victim.isFraud(transaction);
        String expectedResult = null;
        check(actualResult, expectedResult, "testFraudDetectorShouldNotDetectRules");
    }

    public FraudRule[] fillArray() {
        FraudRule[] fraudRules = new FraudRule[5];
        fraudRules[0] = new FraudRule1("Rule1");
        fraudRules[1] = new FraudRule2("Rule2");
        fraudRules[2] = new FraudRule3("Rule3");
        fraudRules[3] = new FraudRule4("Rule4");
        fraudRules[4] = new FraudRule5("Rule5");
        return fraudRules;
    }

    public void check(FraudDetectionResult actualResult, String expectedResult, String testName) {
        if (actualResult.getRuleName() == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
