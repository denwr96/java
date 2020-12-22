package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCountry().equals("Germany") && t.getAmount() > 10000) {
            return true;
        }
        return false;
    }
}