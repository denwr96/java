package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        String city = t.getTrader().getCity();
        return (city.equals("Sydney"));
    }

    @Override
    public String getRuleName() {
        return ruleName;
    }
}
