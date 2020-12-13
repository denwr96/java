package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_6;


class FraudRule5Test {
    public static void main(String[] args) {
        FraudRule5Test test = new FraudRule5Test();
        test.FraudRule5();
    }

    public void FraudRule5() {
        Trader test = new Trader("John Brown", "Berlin", "Germany");
        Transaction t = new Transaction(test, 1001);
        FraudRule5 victim = new FraudRule5("ruleAmountAndCountry");
        boolean actualResult = victim.isFraud(t);
        check(actualResult, "Fraud for Rule5");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
