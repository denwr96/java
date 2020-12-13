package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_5;
//task29

class FraudDetector {

    FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        for (int i = 0; i < fraudRules.length; i++) {
            if (fraudRules[i].isFraud(t)) {
                return true;
            }
        }
        return false;

    }

}