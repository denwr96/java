package javaguru.sunday.student_nataliya_sinitsa.lesson9.level5task22;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudDetector {

    FraudRule[] fraudRules = new FraudRule[5];

    FraudDetector() {
        fraudRules[0] = new FraudRule1("Fraud rule 1");
        fraudRules[1] = new FraudRule2("Fraud rule 2");
        fraudRules[2] = new FraudRule3("Fraud rule 3");
        fraudRules[3] = new FraudRule4("Fraud rule 4");
        fraudRules[4] = new FraudRule5("Fraud rule 5");
    }

    boolean isFraud(Transaction t) {
        boolean isFraudTransaction = false;
        for (FraudRule fraudRule : fraudRules) {
             isFraudTransaction = fraudRule.isFraud(t);
             if (isFraudTransaction) {
                 break;
             }
        }
        return isFraudTransaction;
    }


}
