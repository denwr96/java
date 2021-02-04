package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;


import javaguru.sunday.teacher.annotations.CodeReview;

//Task_23
//Task_31
@CodeReview(approved = true)
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
