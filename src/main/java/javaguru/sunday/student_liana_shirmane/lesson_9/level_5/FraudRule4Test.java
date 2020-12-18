package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task27
@CodeReview(approved = true)
class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test test = new FraudRule4Test();
        test.FraudRule4();
    }

    public void FraudRule4() {
        Trader test = new Trader("John Nordmann", "Kingston", "Jamaica");
        Transaction t = new Transaction(test, 1000000);
        FraudRule4 victim = new FraudRule4("ruleCountry");
        boolean actualResult = victim.isFraud(t);
        check(actualResult, "Fraud for Rule4");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
