package javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

//Task_17
//Task_24
@CodeReview(approved = false)
@CodeReviewComment(comment = "Тело метода isFraud может быть упрощено вот так:" +
        "return t.getTrader().getFullName().equals(\"Pokemon\");" +
        "Переделать все правила подобным образом.")
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }


    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

}

