package javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 26 (level 5)
@CodeReview(approved = true)
class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getCity().equals("Sydney")) {
            return true;
        } else {
            return false;
        }
    }
}
