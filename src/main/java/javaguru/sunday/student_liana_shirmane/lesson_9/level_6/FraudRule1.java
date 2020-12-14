package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_6;


class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
       Trader trader = t.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }

        return false;
    }
}