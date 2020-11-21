package main.java.javaguru.sunday.student_kristina_sutugina.lesson_7.level_6;
//Task_11

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.pinCodeTest();
        creditCardTest.checkWithdrawOne();
        creditCardTest.checkWithdrawTwo();
        creditCardTest.checkWithdrawThree();
        creditCardTest.checkDepositOne();
        creditCardTest.checkDepositTwo();
        creditCardTest.checkChangeLimit();
    }


    public void pinCodeTest() {
        int pin = 123456;
        CreditCard creditCard = new CreditCard(123, 123456);
        boolean actualResult = creditCard.checkPinCode(pin);
        check(actualResult, "pinCodeTest");
    }

    public void checkWithdrawOne() {
        int amount = 4;
        CreditCard creditCard = new CreditCard(123, 123456, 5);
        creditCard.withdraw(123456, amount);
        int result = 4;
        check2(result, creditCard.getLoanDebt(), "checkWithdrawOne");
    }

    public void checkWithdrawTwo() {
        int amount = 4;
        CreditCard creditCard = new CreditCard(123, 123456, 5);
        creditCard.deposit(123456, 5);
        creditCard.withdraw(123456, amount);
        int result = 1;
        check2(result, creditCard.getBalance(), "checkWithdrawTwo");
    }

    public void checkWithdrawThree() {
        int amount = 6;
        CreditCard creditCard = new CreditCard(123, 123456, 5);
        creditCard.withdraw(123456, amount);
        int result = creditCard.getCreditLimit();
        check2(amount, result, "checkWithdrawThree");
    }

    public void checkDepositOne() {
        int amount = 4;
        CreditCard creditCard = new CreditCard(123, 123456, 5);
        creditCard.deposit(123456, amount);
        int result = 4;
        check2(result, creditCard.getBalance(), "checkDepositOne");
    }

    public void checkDepositTwo() {
        int amount = 4;
        int amount2 = 7;
        CreditCard creditCard = new CreditCard(123, 123456, 5);
        creditCard.withdraw(123456, amount);
        creditCard.deposit(123456, amount2);
        int result = 3;
        check2(result, creditCard.getBalance(), "checkDepositTwo");
    }

    public void checkChangeLimit() {
        int newLimit = 10;
        CreditCard creditCard = new CreditCard(123, 123456, 5);
        creditCard.changeLimit(123456, 10);
        int result = creditCard.getCreditLimit();
        check2(newLimit, result, "checkChangeLimit");
    }

    public void check(boolean condition, String tesName) {
        if (condition) {
            System.out.println(tesName + " test passed.");
        } else {
            System.out.println(tesName + " test failed.");
        }
    }

    public void check2(int expectedResult, int actualResult, String tesName) {
        if (expectedResult == actualResult) {
            System.out.println(tesName + " test passed.");
        } else {
            System.out.println(tesName + " test failed.");
        }
    }
}
