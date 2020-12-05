package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_4;
//task17
//task18
//task19
//task20
//task21

class FraudDetector {

    FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t, FraudRule[] fraudRules) {
        for (int i = 0; i < fraudRules.length; i++) {
            if (fraudRules[i].isFraud(t)) {
                return true;
            }
        }
        return false;

//    boolean isFraud(Transaction t) {
//        Trader trader = t.getTrader();
//        if (trader.getFullName().equals("Pokemon")) {
//            return true;
//        } else if (t.getAmount() > 1000000) {
//            return true;
//        } else if (trader.getCity().equals("Sidney") || trader.getCountry().equals("Jamaica")) {
//            return true;
//        } else if ((t.getAmount() > 1000) && trader.getCountry().equals("Germany")) {
//            return true;
//        }
//        else return false;
//    }
    }

}