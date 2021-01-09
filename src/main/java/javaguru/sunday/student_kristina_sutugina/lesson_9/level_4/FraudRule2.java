package javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;
//Task_18
//Task_25
class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getAmount() > 1000000);
    }

}