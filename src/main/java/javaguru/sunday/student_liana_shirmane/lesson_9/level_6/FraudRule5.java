package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_6;


class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ((t.getAmount() > 1000) && trader.getCountry().equals("Germany")) {
            return true;
        }

        return false;
    }
}