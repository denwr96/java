package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;


//Task_24
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader traderInfo = transaction.getTrader();
        return traderInfo.getFullName().equals("Pokemon");
    }

}
