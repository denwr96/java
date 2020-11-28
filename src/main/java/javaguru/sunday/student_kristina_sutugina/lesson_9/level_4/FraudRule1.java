package main.java.javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;
//Task_17
//Task_24
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }


    public boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }

}

