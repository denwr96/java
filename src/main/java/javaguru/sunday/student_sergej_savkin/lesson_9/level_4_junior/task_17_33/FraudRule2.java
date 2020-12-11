package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task25
@CodeReview(approved = true)
class FraudRule2 extends FraudRule{

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction) {
        if (transaction.getAmount() > 1000000) {
            return true;
        }
        return false;
    }

}
