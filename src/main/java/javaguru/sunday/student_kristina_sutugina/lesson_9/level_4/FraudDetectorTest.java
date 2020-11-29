package main.java.javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;

import java.util.Objects;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.FraudDetectorTest();
    }

    public void FraudDetectorTest(){
        Trader trader = new Trader("Pokemon", "Moscow");
        Transaction t = new Transaction(trader, 10);
      FraudRule1 fraud1 = new FraudRule1("Fraud Detector Test Rule One");
        FraudRule2 fraud2 = new FraudRule2("Fraud Detector Test Rule Two");
        FraudRule3 fraud3 = new FraudRule3("Fraud Detector Test Rule Three");
        FraudRule4 fraud4 = new FraudRule4("Fraud Detector Test Rule Four");
        FraudRule5 fraud5 = new FraudRule5("Fraud Detector Test Rule Five");
        FraudRule [] fraudRule = {fraud1, fraud2, fraud3, fraud4, fraud5};
        FraudDetector fraud = new FraudDetector(fraudRule);
        if(Objects.equals(fraud.isFraud(t), false)){
            System.out.println("Clean client");
        } else{
            System.out.println("One of the rule is broken");
        }
    }
}
