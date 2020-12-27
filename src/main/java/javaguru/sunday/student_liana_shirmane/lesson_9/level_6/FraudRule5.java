package javaguru.sunday.student_liana_shirmane.lesson_9.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ((t.getAmount() > 1000) && trader.getCountry().equals("Germany")) {
            return true;
        }

        return false;
    }
}