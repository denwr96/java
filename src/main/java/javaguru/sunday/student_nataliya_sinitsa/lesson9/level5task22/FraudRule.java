package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level5task22;

//Task 23 --> Task 33

abstract class FraudRule {

    private String ruleName;

    FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    abstract boolean isFraud(Transaction t);

    String getRuleName() {
        return ruleName;
    }

}
