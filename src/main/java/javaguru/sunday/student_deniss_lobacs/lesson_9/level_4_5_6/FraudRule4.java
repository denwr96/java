package javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }

}
