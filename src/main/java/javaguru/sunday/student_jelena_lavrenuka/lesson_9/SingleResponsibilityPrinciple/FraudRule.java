package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class FraudRule {

    protected String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    public abstract String getRuleName();

}

