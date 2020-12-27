package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;


//Task_25
class FraudRule2 extends FraudRule{


    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}
