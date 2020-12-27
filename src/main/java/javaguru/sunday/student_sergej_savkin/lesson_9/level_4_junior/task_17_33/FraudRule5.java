package javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

import javaguru.sunday.teacher.annotations.CodeReview;

//task28
@CodeReview(approved = true)
class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getCountry().equals("Germany")) {
            return true;
        }
        return false;
    }

}
