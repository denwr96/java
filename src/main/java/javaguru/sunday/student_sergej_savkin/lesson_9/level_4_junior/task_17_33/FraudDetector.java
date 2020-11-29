package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

//task17
//task18
//task19
//task20
//task21
//task29
//task30
//task31
//task32
//task33

class FraudDetector {

    FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction transaction, FraudRule[] fraudRules) {
        for (int i = 0; i < fraudRules.length; i++) {
            if (fraudRules[i].isFraud(transaction)) {
                FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(fraudRules[i].isFraud(transaction), fraudRules[i].getRuleName());
                System.out.println(transaction.toString());
                System.out.println("RuleName: " + fraudRules[i].getRuleName());
                return fraudDetectionResult;
            }
        }
        return null;
    }
    
/*
    boolean isFraud(Transaction transaction, FraudRule[] fraudRules) {
        for (int i = 0; i < fraudRules.length; i++) {
            if (fraudRules[i].isFraud(transaction)) {
                return true;
            }
        }
        return false;
    }
*/
    /*
    boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }else if (transaction.getAmount() > 1000000) {
            return true;
        } else if (transaction.getTrader().getCity().equals("Sidney")) {
            return true;
        } else if (transaction.getTrader().getCountry().equals("Jamaica") ||
                (transaction.getTrader().getCountry().equals("Germany"))) {
            return true;
        } else {
            return false;
        }
    }
*/
}
