package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        int amount = t.getAmount();
        String country = t.getTrader().getCountry();
        return country.equals("Germany") && amount > 1000;
    }

    @Override
    public String getRuleName() {
        return getRuleName();
    }
}

