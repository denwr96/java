package javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_23
//Task_31
@CodeReview(approved = true)
abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    String getRuleName() {
        return ruleName;
    }
}
