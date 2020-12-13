package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6;

public abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public abstract boolean isFraud(Transaction t);
}
