package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

//task26

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getCity().equals("Sidney")) {
            return true;
        }
        return false;
    }

}
