package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level5task22;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

//Task 33
@CodeReview(approved = false)
@CodeReviewComment(comment = "Метод ifFarud переусложнен. Надо переделать. Если встретили fraud, то надо вернуть объект, который хранит название рула и флаг true. Если не втретили, то возвращать надо объект с флагом false")
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
        boolean isFraudTransaction = false;
        String fraudRuleName = "Transaction has passed";
        for (FraudRule fraudRule : fraudRules) {
            isFraudTransaction = fraudRule.isFraud(t);
            if (isFraudTransaction) {
                fraudRuleName = fraudRule.getRuleName();
                System.out.println(t.toString());
                break;
            }
        }
        System.out.println(fraudRuleName);
        return new FraudDetectionResult(isFraudTransaction, fraudRuleName);

    }

}
