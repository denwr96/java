package javaguru.sunday.student_liana_shirmane.lesson_9.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

//task24
@CodeReview(approved = true)
@CodeReviewComment(comment = "Можно упростить выражение до одной строки: return trader.getFullName().equals(\"Pokemon\");" +
        "т.к. результатом этого выражения является true или false, его можно сразу вернуть.")
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
       Trader trader = t.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }

        return false;
    }
}