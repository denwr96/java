package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

// Task 24 (level 5)

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getFullName() == "Pokemon") {
            return true;
        } else {
            return false;
        }
    }
}
