package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

// Task 27 (level 5)

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getCountry() == "Jamaica") {
//            System.out.println("Sorry, your transaction is blocked (code 4)");
            return true;
        } else {
            return false;
        }
    }

}
