package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level5task22;

//Task 23 --> Task 33

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000;
    }

}
