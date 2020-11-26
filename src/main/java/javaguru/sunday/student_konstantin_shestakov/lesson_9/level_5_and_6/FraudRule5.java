package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

// Task 28 (level 5)

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getCountry() == "Germany" && transaction.getAmount() > 1000) {
//            System.out.println("Sorry, your transaction is blocked (code 5)");
            return true;
        } else {
            return false;
        }
    }
}
