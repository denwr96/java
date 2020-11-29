//package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6;
//
//// task29;
//
//public class FraudDetectorTestV2 {
//    public static void main(String[] args) {
//        FraudDetectorTestV2 fraudDetectorTestV2 = new FraudDetectorTestV2();
//        fraudDetectorTestV2.testFraudDetectorShouldCheckFirstRuleMustReturnTrue();
//        fraudDetectorTestV2.testFraudDetectorShouldCheckFirstRuleMustReturnFalse();
//        fraudDetectorTestV2.testFraudDetectorShouldCheckSecondRuleMustReturnTrue();
//        fraudDetectorTestV2.testFraudDetectorShouldCheckSecondRuleMustReturnFalse();
//    }
//
//    public void testFraudDetectorShouldCheckFirstRuleMustReturnTrue() {
//        Trader testTrader = new Trader("Pokemon" , "Ogre" , "Latvia");
//        Transaction transaction = new Transaction(testTrader,100);
//        FraudDetector victim = new FraudDetector(fillArray());
//        boolean expectedResult = true;
//        boolean actualResult = victim.isFraud(transaction);
//        check(expectedResult , actualResult , "testFraudDetectorShouldCheckFirstRuleMustReturnTrue");
//    }
//
//    public void testFraudDetectorShouldCheckFirstRuleMustReturnFalse() {
//        Trader testTrader = new Trader("Denis" , "Ogre" , "Latvia");
//        Transaction transaction = new Transaction(testTrader,100);
//        FraudDetector victim = new FraudDetector(fillArray());
//        boolean expectedResult = false;
//        boolean actualResult = victim.isFraud(transaction);
//        check(expectedResult , actualResult , "testFraudDetectorShouldCheckFirstRuleMustReturnFalse");
//    }
//
//    public void testFraudDetectorShouldCheckSecondRuleMustReturnTrue() {
//        Trader testTrader = new Trader("Pokemon" , "Ogre" , "Latvia");
//        Transaction transaction = new Transaction(testTrader,10000000);
//        FraudDetector victim = new FraudDetector(fillArray());
//        boolean expectedResult = true;
//        boolean actualResult = victim.isFraud(transaction);
//        check(expectedResult , actualResult , "testFraudDetectorShouldCheckSecondRuleMustReturnTrue");
//    }
//
//    public void testFraudDetectorShouldCheckSecondRuleMustReturnFalse() {
//        Trader testTrader = new Trader("Denis" , "Ogre" , "Latvia");
//        Transaction transaction = new Transaction(testTrader,100);
//        FraudDetector victim = new FraudDetector(fillArray());
//        boolean expectedResult = false;
//        boolean actualResult = victim.isFraud(transaction);
//        check(expectedResult , actualResult , "testFraudDetectorShouldCheckSecondRuleMustReturnFalse");
//    }
//
//    public FraudRule[] fillArray() {
//        FraudRule[] fraudRules = new FraudRule[5];
//        fraudRules[0] = new FraudRule1("Rule1");
//        fraudRules[1] = new FraudRule2("Rule2");
//        fraudRules[2] = new FraudRule3("Rule3");
//        fraudRules[3] = new FraudRule4("Rule4");
//        fraudRules[4] = new FraudRule5("Rule5");
//        return fraudRules;
//    }
//
//    public void check(boolean actualResult,boolean expectedResult, String testName) {
//        if (actualResult == expectedResult) {
//            System.out.println(testName + " = OK");
//        } else {
//            System.out.println(testName + " = FAILED");
//        }
//    }
//}
