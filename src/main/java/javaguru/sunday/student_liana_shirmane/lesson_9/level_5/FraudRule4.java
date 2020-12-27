package javaguru.sunday.student_liana_shirmane.lesson_9.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

//task24
@CodeReview(approved = true)
class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCountry().equals("Jamaica")) {
            return true;
        }

        return false;
    }
}