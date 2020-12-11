package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level5task22;

//Task 23 --> Task 33

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sidney");
    }

}
