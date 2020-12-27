package javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        String name = t.getTrader().getFullName();
        return name.equals("Pokemon");
    }

    @Override
    public String getRuleName() {
        return ruleName;
    }
}
