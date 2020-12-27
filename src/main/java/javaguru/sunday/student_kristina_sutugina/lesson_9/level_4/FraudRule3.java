package javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;
//Task_19
//Task_26
class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if(t.getTrader().getCity().equals("Sydney")){
            return true;
        }
        return false;
    }

}
