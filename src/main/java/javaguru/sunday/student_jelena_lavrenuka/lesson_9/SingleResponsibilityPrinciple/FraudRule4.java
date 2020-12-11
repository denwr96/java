package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        String country = t.getTrader().getCountry();
        return (country.equals("Jamaica"));
    }

    @Override
    public String getRuleName() {
        return getRuleName();
    }
}
