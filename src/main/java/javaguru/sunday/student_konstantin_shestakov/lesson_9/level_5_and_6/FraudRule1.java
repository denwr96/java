package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 24 (level 5)
@CodeReview(approved = false)
@CodeReviewComment(comment = "Сравнивайте объекты через .equals")
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getFullName() == "Pokemon") {
//            System.out.println("Sorry, your transaction is blocked (code 1)");
            return true;
        } else {
            return false;
        }
    }
}
