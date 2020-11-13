package main.java.javaguru.sunday.student_sergej_savkin.lesson_7.level_6_middle.task_11;

class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();

        creditCardTest.checkPinCodeTest();
        creditCardTest.checkPinCodeFailTest();

        creditCardTest.setNewCreditLimitTest();

        creditCardTest.makeDepositTest();
        creditCardTest.makeDepositTestTwo();
        creditCardTest.makeWithdrawTest();

    }

    public void checkPinCodeTest(){
        CreditCard test = new CreditCard(1234, 1234);
        check(test.checkPinCode(1234), "checkPinCodeTest");
    }

    public void checkPinCodeFailTest(){
        CreditCard test = new CreditCard(1234, 1234);
        check(!test.checkPinCode(1231), "checkPinCodeTest");
    }

    public void setNewCreditLimitTest(){
        CreditCard test = new CreditCard(1234, 1234);
        test.setNewCreditLimit(1234, 10);
        check(test.getCreditLimit(), 10, "setNewCreditLimitTest");
    }

    public void makeDepositTest(){
        CreditCard test = new CreditCard(1234, 1234);
        test.setNewCreditLimit(1234, 10);
        test.makeDeposit(1234, 100);
        check(100, test.getBalance(), "makeDepositBalanceTest");
        check(0, test.getCreditDebt(), "makeDepositCreditDebtTest");
    }

    public void makeDepositTestTwo(){
        CreditCard test = new CreditCard(1234, 1234);
        test.setNewCreditLimit(1234, 10);
        test.makeDeposit(1234, 100);
        test.makeWithdraw(1234, 110);
        test.makeDeposit(1234, 10);
        check(0, test.getBalance(), "makeDepositBalanceTestTwo");
        check(0, test.getCreditDebt(), "makeDepositCreditDebtTestTwo");
    }

    public void makeWithdrawTest() {
        CreditCard test = new CreditCard(1234, 1234);
        test.setNewCreditLimit(1234, 10);
        test.makeDeposit(1234, 100);
        test.makeWithdraw(1234, 110);
        check(0, test.getBalance(), "makeWithdrawBalanceTest");
        check(10, test.getCreditDebt(), "makeWithdrawCreditDebtTest");
        test.makeDeposit(1234, 20);
        check(10,test.getBalance(), "makeWithdrawBalanceTestTwo");
        check(0, test.getCreditDebt(), "makeWithdrawCreditDebtTestTwo");
    }


    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
