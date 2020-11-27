package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

// Task 25 (level 5)

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction) {
        if (transaction.getAmount() > 1000000) {
//            System.out.println("Sorry, your transaction is blocked (code 2)");
            return true;
        } else {
            return false;
        }
    }
}
