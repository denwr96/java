package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task32
//task33
@CodeReview(approved = true)
class FraudDetector {

    FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    public FraudDetectionResult isFraud(Transaction t) {
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult();
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                fraudDetectionResult.setFraud(true);
                fraudDetectionResult.setRuleName(fraudRule.getRuleName());
                System.out.println("Rule name : " + fraudRule.getRuleName());
                System.out.println(t.toString());
            }
        }
        return fraudDetectionResult;

    }

}