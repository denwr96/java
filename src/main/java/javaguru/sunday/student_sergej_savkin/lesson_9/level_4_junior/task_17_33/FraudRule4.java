package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

//task27

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }

}
