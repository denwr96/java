package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        int amount = t.getAmount();
        return amount >= 1000000;
    }

    @Override
    public String getRuleName() {
        return getRuleName();
    }
}
