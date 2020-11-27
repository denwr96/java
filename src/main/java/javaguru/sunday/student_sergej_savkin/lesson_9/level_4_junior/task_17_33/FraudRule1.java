package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

//task24

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
    return false;
    }

}