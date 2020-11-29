package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

// Task 26 (level 5)

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getCity() == "Sydney") {
//            System.out.println("Sorry, your transaction is blocked (code 3)");
            return true;
        } else {
            return false;
        }
    }
}
