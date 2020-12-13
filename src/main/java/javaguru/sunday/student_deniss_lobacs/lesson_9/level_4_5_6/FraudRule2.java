package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6;

public class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }

}