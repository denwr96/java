package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;

//Task_28
class FraudRule5 extends FraudRule{

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader traderInfo = transaction.getTrader();
        return (traderInfo.getCountry().equals("Germany") && transaction.getAmount() > 1000);
    }
}
