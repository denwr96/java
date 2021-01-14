package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_25
@CodeReview(approved = true)
class FraudRule2 extends FraudRule{


    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}
