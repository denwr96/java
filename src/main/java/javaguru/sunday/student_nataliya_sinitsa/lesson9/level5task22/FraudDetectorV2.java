package javaguru.sunday.student_nataliya_sinitsa.lesson9.level5task22;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

//Task 33
@CodeReview(approved = true)
class FraudDetectorV2 {

    FraudRule[] fraudRules = new FraudRule[5];

    FraudDetectorV2() {
        fraudRules[0] = new FraudRule1("Fraud rule 1");
        fraudRules[1] = new FraudRule2("Fraud rule 2");
        fraudRules[2] = new FraudRule3("Fraud rule 3");
        fraudRules[3] = new FraudRule4("Fraud rule 4");
        fraudRules[4] = new FraudRule5("Fraud rule 5");
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                System.out.println("Fraud transaction detected: " + t.toString());
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }

}

