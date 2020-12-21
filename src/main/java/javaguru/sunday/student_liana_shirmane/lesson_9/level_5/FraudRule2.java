package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task25
@CodeReview(approved = true)
class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        }

        return false;
    }
}