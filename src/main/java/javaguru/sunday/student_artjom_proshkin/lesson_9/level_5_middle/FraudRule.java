package main.java.javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;

//Task_23
//Task_31
abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction transaction);

    String getRuleName() {
        return ruleName;
    }

    @Override
    public String toString() {
        return "RuleName ='" + ruleName + '\'';
    }
}
