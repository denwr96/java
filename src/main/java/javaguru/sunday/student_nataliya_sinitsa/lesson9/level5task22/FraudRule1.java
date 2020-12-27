package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level5task22;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task 23 --> Task 33
@CodeReview(approved = true)
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

}