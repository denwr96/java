package javaguru.sunday.student_liana_shirmane.lesson_9.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test test = new FraudRule3Test();
        test.FraudRule3();
    }

    public void FraudRule3() {
        Trader test = new Trader("John Nordmann", "Sidney", "Australia");
        Transaction t = new Transaction(test, 1000000);
        FraudRule3 victim = new FraudRule3("ruleCity");
        boolean actualResult = victim.isFraud(t);
        check(actualResult, "Fraud for Rule3");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
