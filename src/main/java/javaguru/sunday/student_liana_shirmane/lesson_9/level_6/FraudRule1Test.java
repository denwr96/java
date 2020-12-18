package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test test = new FraudRule1Test();
        test.FraudRule1();
    }

    public void FraudRule1() {
        Trader test = new Trader("Pokemon", "Riga", "Latvia");
        Transaction t = new Transaction(test, 100);
        FraudRule1 victim = new FraudRule1("ruleName");
        boolean actualResult = victim.isFraud(t);
        check(actualResult, "Fraud for Rule1");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
