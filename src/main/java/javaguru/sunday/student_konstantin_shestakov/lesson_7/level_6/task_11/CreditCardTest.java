package javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.creditCardLoginTest1();
        creditCardTest.creditCardLoginTest2();
        creditCardTest.creditCardDepositTest1();
        creditCardTest.creditCardDepositTest2();
        creditCardTest.creditCardWithdrawalTest1();
        creditCardTest.creditCardWithdrawalTest2();
    }

    void creditCardLoginTest1(){
        CreditCard creditCard = new CreditCard("Customer1",1111222233334444L,1234, 0, 1000);
        checkResults(!creditCard.login(4321), "Login test 2 (1/3)");
        checkResults(!creditCard.login(4321), "Login test 2 (2/3)");
        checkResults(!creditCard.login(4321), "Login test 2 (3/3)");
    }

    void creditCardLoginTest2(){
        CreditCard creditCard = new CreditCard("Customer1",1111222233334444L,1234, 0, 1000);
        checkResults(creditCard.login(1234), "Login test 1");
    }

    void creditCardDepositTest1(){
        CreditCard creditCard = new CreditCard("Customer1",1111222233334444L,1234, 0, 1000);
        creditCard.login(1234);
        checkResults(creditCard.deposit(100) == 100, "Deposit test 1");
    }

    void creditCardDepositTest2(){
        CreditCard creditCard = new CreditCard("Customer1",1111222233334444L,1234, -1000, 1000);
        creditCard.login(1234);
        checkResults(creditCard.deposit(1000) == 0, "Deposit test 2");
    }

    void creditCardWithdrawalTest1(){
        CreditCard creditCard = new CreditCard("Customer1",1111222233334444L,1234, 1000, 1000);
        creditCard.login(1234);
        checkResults(creditCard.withdrawal(1000) == 0, "Withdrawal test 1");
    }

    void creditCardWithdrawalTest2(){
        CreditCard creditCard = new CreditCard("Customer1",1111222233334444L,1234, 1000, 1000);
        creditCard.login(1234);
        checkResults(creditCard.withdrawal(3000) == 1000, "Withdrawal test 2");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK\n");
            return condition;
        } else {
            System.out.println(testName + " = FAIL\n");
            return !condition;
        }
    }
}
