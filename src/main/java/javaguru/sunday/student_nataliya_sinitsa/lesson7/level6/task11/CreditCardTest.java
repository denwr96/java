package javaguru.sunday.student_nataliya_sinitsa.lesson7.level6.task11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.shouldWithdrawMoneyFromCredit();
        test.shouldFailWithdrawMoneyFromCreditDueToLimit();
        test.shouldFailWithdrawMoneyFromCreditDueToPinCode();
        test.shouldGetDepositOnBalance();
        test.shouldGetDepositOnCreditAndBalance();
        test.shouldGetDepositOnCredit();
        test.shouldFailDeposit();
        test.shouldWithdrawMoneyFromBalanceAndCredit();
    }

    public void shouldWithdrawMoneyFromCredit() {
        CreditCard victim = new CreditCard("112344567789", 2234);
        int enteredPinCode = 2234;
        victim.setCreditLimit(1000);
        victim.withdraw(enteredPinCode, 16.0);
        double actualBalance = victim.getBalance();
        double actualCreditDefault = victim.creditDefault;
        check(actualBalance == 0.0 && actualCreditDefault == 16.0, "shouldWithdrawMoneyFromCredit");
        System.out.println(" ");
    }


    public void shouldFailWithdrawMoneyFromCreditDueToLimit() {
        CreditCard victim = new CreditCard("112344567789", 2234);
        int enteredPinCode = 2234;
        victim.setCreditLimit(1000);
        victim.withdraw(enteredPinCode, 1600);
        double actualBalance = victim.getBalance();
        double actualCreditDefault = victim.creditDefault;
        check(actualBalance == 0.0 && actualCreditDefault == 0.0,
                "shouldFailWithdrawMoneyFromCreditDueToLimit");
        System.out.println(" ");
    }

    public void shouldFailWithdrawMoneyFromCreditDueToPinCode() {
        CreditCard victim = new CreditCard("112344567789", 2234);
        int enteredPinCode = 2233;
        victim.setCreditLimit(1000);
        victim.withdraw(enteredPinCode, 100);
        double actualBalance = victim.getBalance();
        double actualCreditDefault = victim.creditDefault;
        check(actualBalance == 0.0 && actualCreditDefault == 0.0,
                "shouldFailWithdrawMoneyFromCreditDueToPinCode");
        System.out.println(" ");
    }

    public void shouldGetDepositOnCredit() {
        CreditCard victim = new CreditCard("112344567789", 2234);
        int enteredPinCode = 2234;
        victim.setCreditLimit(1000);
        victim.withdraw(enteredPinCode,100);
        victim.deposit(enteredPinCode, 90);
        double actualBalance = victim.getBalance();
        double actualCreditDefault = victim.creditDefault;
        check(actualBalance == 0.0 && actualCreditDefault == 10.0,
                "shouldGetDepositOnCredit");
        System.out.println(" ");
    }

    public void shouldGetDepositOnCreditAndBalance() {
        CreditCard victim = new CreditCard("112344567789", 2234);
        int enteredPinCode = 2234;
        victim.setCreditLimit(1000);
        victim.withdraw(enteredPinCode,10);
        victim.deposit(enteredPinCode, 90);
        double actualBalance = victim.getBalance();
        double actualCreditDefault = victim.creditDefault;
        check(actualBalance == 80.0 && actualCreditDefault == 0.0,
                "shouldGetDepositOnCreditAndBalance");
        System.out.println(" ");
    }

    public void shouldGetDepositOnBalance() {
        CreditCard victim = new CreditCard("112344567789", 2234);
        int enteredPinCode = 2234;
        victim.setCreditLimit(1000);
        victim.deposit(enteredPinCode, 90);
        double actualBalance = victim.getBalance();
        double actualCreditDefault = victim.creditDefault;
        check(actualBalance == 90.0 && actualCreditDefault == 0.0,
                "shouldGetDepositOnCreditAndBalance");
        System.out.println(" ");
    }

    public void shouldFailDeposit() {
        CreditCard victim = new CreditCard("112344567789", 2234);
        int enteredPinCode = 2233;
        victim.deposit(enteredPinCode, 100);
        double actualBalance = victim.getBalance();
        double actualCreditDefault = victim.creditDefault;
        check(actualBalance == 0.0 && actualCreditDefault == 0.0,
                "shouldFailDeposit");
        System.out.println(" ");
    }

    public void shouldWithdrawMoneyFromBalanceAndCredit() {
        CreditCard victim = new CreditCard("112344567789", 2234);
        int enteredPinCode = 2234;
        victim.setCreditLimit(1000);
        victim.deposit(enteredPinCode, 90);
        victim.withdraw(enteredPinCode,200);
        double actualBalance = victim.getBalance();
        double actualCreditDefault = victim.creditDefault;
        check(actualBalance == 0.0 && actualCreditDefault == 110.0,
                "shouldWithdrawMoneyFromBalanceAndCredit");
        System.out.println(" ");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
