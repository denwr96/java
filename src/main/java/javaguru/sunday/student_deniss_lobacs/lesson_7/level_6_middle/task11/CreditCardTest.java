package main.java.javaguru.sunday.student_deniss_lobacs.lesson_7.level_6_middle.task11;

public class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest creditCardTest = new CreditCardTest();

        creditCardTest.setNewCreditLimitTest();
        creditCardTest.setNewCreditLimitTestFail();
        creditCardTest.makeDepositTest();
        creditCardTest.makeDepositTestFail();
        creditCardTest.makeWithdrawTest();
        creditCardTest.makeWithdrawTestFail();
        creditCardTest.checkCreditDebtTest();
        creditCardTest.checkCreditDebtTestFail();
    }

    public void setNewCreditLimitTest(){
        CreditCard test = new CreditCard(11111, 1234);
        test.setCreditLimit(10);
        check(test.getCreditLimit(), 10, "setNewCreditLimitTest");
    }

    public void setNewCreditLimitTestFail(){
        CreditCard test = new CreditCard(11111, 1234);
        test.setCreditLimit(10);
        check(test.getCreditLimit(), 20, "setNewCreditLimitTestFail");
    }

    public void makeDepositTest(){
        CreditCard test = new CreditCard(1234, 1234);
        test.makeDeposit(1234, 500);
        check(500, test.getBalance(), "makeDepositBalanceTest");
    }

    public void makeDepositTestFail(){
        CreditCard test = new CreditCard(1234, 1234);
        test.makeDeposit(1234, 500);
        check(0, test.getBalance(), "makeDepositBalanceTestFail");
    }

    public void makeWithdrawTest() {
        CreditCard test = new CreditCard(1234, 1234);
        test.setCreditLimit(500);
        test.makeWithdraw(1234, 500);
        check(0, test.getBalance(), "makeWithdrawBalanceTest");
    }

    public void makeWithdrawTestFail() {
        CreditCard test = new CreditCard(1234, 1234);
        test.setCreditLimit(500);
        test.makeWithdraw(1234, 500);
        check(500, test.getBalance(), "makeWithdrawBalanceTestFail");
    }

    public void checkCreditDebtTest() {
        CreditCard test = new CreditCard(1234, 1234);
        test.setCreditLimit(500);
        test.makeWithdraw(1234, 500);
        check(500, test.getCreditDebt(), "checkCreditDebtTest");
    }

    public void checkCreditDebtTestFail() {
        CreditCard test = new CreditCard(1234, 1234);
        test.setCreditLimit(500);
        test.makeWithdraw(1234, 500);
        check(0, test.getCreditDebt(), "checkCreditDebtTestFail");
    }

    public void check(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + ": OK!");
        } else {
            System.out.println(testName + ": FAIL!");
        }
    }
}
