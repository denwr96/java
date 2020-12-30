package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;

//Task_26
class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader traderInfo = transaction.getTrader();
        return (traderInfo.getCity().equals("Sydney"));
    }
}
