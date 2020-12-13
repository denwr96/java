package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_4;
//task26

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCity().equals("Sidney")) {
            return true;
        }
        return false;
    }
}