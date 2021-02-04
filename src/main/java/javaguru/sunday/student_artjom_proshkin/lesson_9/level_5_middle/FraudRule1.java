package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_24
@CodeReview(approved = true)
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader traderInfo = transaction.getTrader();
        return traderInfo.getFullName().equals("Pokemon");
    }

}
