package javaguru.sunday.student_liana_shirmane.lesson_9.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

//task24
@CodeReview(approved = true)
class FraudRule2Test {
    public static void main(String[] args) {
        FraudRule2Test test = new FraudRule2Test();
        test.FraudRule2();
    }

    public void FraudRule2() {
      Trader test = new Trader("John Nordmann", "Riga", "Latvia");
        Transaction t = new Transaction(test, 1000001);
        FraudRule2 victim = new FraudRule2("ruleAmount");
        boolean actualResult = victim.isFraud(t);
        check(actualResult, "Fraud for Rule2");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
