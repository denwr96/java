package javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 27 (level 5)
@CodeReview(approved = true)
class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getCountry().equals("Jamaica")) {
            return true;
        } else {
            return false;
        }
    }

}
