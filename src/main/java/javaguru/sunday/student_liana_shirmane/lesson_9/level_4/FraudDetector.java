package javaguru.sunday.student_liana_shirmane.lesson_9.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//task17
//task18
//task19
//task20
//task21
@CodeReview(approved = true)
class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        } else if (t.getAmount() > 1000000) {
            return true;
        } else if (trader.getCity().equals("Sidney") || trader.getCountry().equals("Jamaica")) {
            return true;
        } else if ((t.getAmount() > 1000) && trader.getCountry().equals("Germany")) {
            return true;
        }
        else return false;
    }
    }

