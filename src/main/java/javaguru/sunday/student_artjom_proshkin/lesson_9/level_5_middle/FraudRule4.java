package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;

//Task_27
class FraudRule4 extends FraudRule{

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader traderInfo = transaction.getTrader();
        return traderInfo.getCountry().equals("Jamaica");
    }
}
