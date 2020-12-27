package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level5task22;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task 23 --> Task 29
@CodeReview(approved = true)
class FraudRuleTest {

    public static void main(String[] args) {

        FraudRuleTest test = new FraudRuleTest();

        test.shouldBeFalseRule1();
        test.shouldBeTrueRule1();
        test.shouldBeFalseRule2();
        test.shouldBeTrueRule2();
        test.shouldBeFalseRule3();
        test.shouldBeTrueRule3();
        test.shouldBeFalseRule4();
        test.shouldBeTrueRule4();
        test.shouldBeFalseRule5Ex1();
        test.shouldBeFalseRule5Ex2();
        test.shouldBeFalseRule5Ex3();
        test.shouldBeTrueRule5();
    }

    public void shouldBeFalseRule1() {
        FraudRule1 victim = new FraudRule1("Fraud rule 1");
        Trader testTrader = new Trader("Poke", "Bremen", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(!victim.isFraud(testTransaction), "shouldBeFalseRule1");
    }

    public void shouldBeTrueRule1() {
        FraudRule1 victim = new FraudRule1("Fraud rule 1");
        Trader testTrader = new Trader("Pokemon", "Bremen", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(victim.isFraud(testTransaction), "shouldBeTrueRule1");
    }

    public void shouldBeFalseRule2() {
        FraudRule2 victim = new FraudRule2("Fraud rule 2");
        Trader testTrader = new Trader("Poke", "Bremen", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(!victim.isFraud(testTransaction), "shouldBeFalseRule2");
    }

    public void shouldBeTrueRule2() {
        FraudRule2 victim = new FraudRule2("Fraud rule 2");
        Trader testTrader = new Trader("Poke", "Bremen", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 1000001);
        check(victim.isFraud(testTransaction), "shouldBeTrueRule2");
    }

    public void shouldBeFalseRule3() {
        FraudRule3 victim = new FraudRule3("Fraud rule 3");
        Trader testTrader = new Trader("Poke", "Canberra", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(!victim.isFraud(testTransaction), "shouldBeFalseRule3");
    }

    public void shouldBeTrueRule3() {
        FraudRule3 victim = new FraudRule3("Fraud rule 3");
        Trader testTrader = new Trader("Poke", "Sidney", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 1000);
        check(victim.isFraud(testTransaction), "shouldBeTrueRule3");
    }

    public void shouldBeFalseRule4() {
        FraudRule4 victim = new FraudRule4("Fraud rule 4");
        Trader testTrader = new Trader("Poke", "Canberra", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(!victim.isFraud(testTransaction), "shouldBeFalseRule3");
    }

    public void shouldBeTrueRule4() {
        FraudRule4 victim = new FraudRule4("Fraud rule 4");
        Trader testTrader = new Trader("Poke", "unknown", "Jamaica");
        Transaction testTransaction = new Transaction(testTrader, 1000);
        check(victim.isFraud(testTransaction), "shouldBeTrueRule4");
    }

    public void shouldBeFalseRule5Ex1() {
        FraudRule5 victim = new FraudRule5("Fraud rule 5");
        Trader testTrader = new Trader("Poke", "Bremen", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(!victim.isFraud(testTransaction), "shouldBeFalseRule5Ex1");
    }

    public void shouldBeFalseRule5Ex2() {
        FraudRule5 victim = new FraudRule5("Fraud rule 5");
        Trader testTrader = new Trader("Poke", "Bremen", "Gerrmany");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(!victim.isFraud(testTransaction), "shouldBeFalseRule5Ex2");
    }

    public void shouldBeFalseRule5Ex3() {
        FraudRule5 victim = new FraudRule5("Fraud rule 5");
        Trader testTrader = new Trader("Poke", "Sidney", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 1001);
        check(!victim.isFraud(testTransaction), "shouldBeFalseRule5Ex3");
    }

    public void shouldBeTrueRule5() {
        FraudRule5 victim = new FraudRule5("Fraud rule 5");
        Trader testTrader = new Trader("Pokemon", "Bremen", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 1001);
        check(victim.isFraud(testTransaction), "shouldBeTrueRule5");
    }


    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
