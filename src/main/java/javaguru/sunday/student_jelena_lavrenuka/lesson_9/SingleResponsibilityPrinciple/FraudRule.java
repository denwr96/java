package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    public abstract String getRuleName();

}

