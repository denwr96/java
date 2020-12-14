package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_6;
//task31


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
