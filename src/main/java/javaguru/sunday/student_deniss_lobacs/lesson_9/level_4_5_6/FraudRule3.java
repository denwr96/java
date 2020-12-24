package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCity().equals("Sydney")) {
            return true;
        }
        return false;
    }

}
