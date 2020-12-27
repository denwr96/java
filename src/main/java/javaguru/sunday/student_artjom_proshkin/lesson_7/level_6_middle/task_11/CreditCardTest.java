package javaguru.sunday.student_artjom_proshkin.lesson_7.level_6_middle.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.checkPinCodePassTest();
        test.checkPinCodeFailTest();
        test.shouldChangeCreditLimitTest();
        test.shouldDepositTest();
        test.shouldWithdrawTest();
        test.shouldWithdrawWithDebtTest();
        test.shouldCancelWithdrawTest();

    }

    void checkPinCodePassTest() {
        CreditCard victim = new CreditCard("9876543", 1023);
        checkResult(victim.checkPinCode(1023), "checkPinCodePassTest");
    }

    void checkPinCodeFailTest() {
        CreditCard victim = new CreditCard("9876543", 1023);
        checkResult(!victim.checkPinCode(1203), "checkPinCodeFailTest");
    }

    void shouldChangeCreditLimitTest() {
        CreditCard victim = new CreditCard("9876543", 1023);
        victim.changeCreditLimit(1023, 555);
        double actual = victim.getCreditLimit();
        checkResult(555, actual, "shouldChangeCreditLimitTest");
    }

    void shouldDepositTest() {
        CreditCard victim = new CreditCard("9876543", 1023);
        victim.deposit(1023, 100);
        victim.deposit(1023, 50);
        double actual = victim.getBalance();
        checkResult(150, actual, "shouldDepositTest");
    }

    void shouldWithdrawTest() {
        CreditCard victim = new CreditCard("9876543", 1023);
        victim.deposit(1023, 200);
        victim.withdraw(1023, 100);
        victim.withdraw(1023, 70);
        double actual = victim.getBalance();
        checkResult(30, actual, "shouldWithdrawTest");

    }

    void shouldWithdrawWithDebtTest() {
        CreditCard victim = new CreditCard("9876543", 1023);
        victim.deposit(1023, 200);
        victim.changeCreditLimit(1023, 100);
        victim.withdraw(1023, 210);
        double actual = victim.getCreditDebt();
        checkResult(10, actual, "shouldWithdrawWithDebtTest");
        System.out.println("Balance = " + victim.getBalance() + " ; CreditDebt = " + victim.getCreditDebt() + " ; CreditLimit = " + victim.getCreditLimit());
    }

    void shouldCancelWithdrawTest() {
        CreditCard victim = new CreditCard("9876543", 1023);
        victim.deposit(1023, 200);
        victim.changeCreditLimit(1023, 100);
        victim.withdraw(1023, 310);
        double actualBalance = victim.getBalance();
        checkResult(200, actualBalance, "shouldCancelWithdrawTest");
        System.out.println("Balance = " + victim.getBalance() + " ; CreditDebt = " + victim.getCreditDebt() + " ; CreditLimit = " + victim.getCreditLimit());

    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }

    void checkResult(double expected, double actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
            System.out.println("Expected = " + expected + " ; Actual = " + actual + " ; " + testName);
        }
    }
}
