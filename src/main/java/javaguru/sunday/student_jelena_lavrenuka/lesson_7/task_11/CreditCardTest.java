package javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.withdrawTest1();
        test.withdrawTest2();
        test.withdrawTest3();
        test.depositTest1();
        test.depositTest2();
    }

    public void withdrawTest1() {
        CreditCard victim = new CreditCard("122333444455555", 1234, 1000, 0, 0);
        victim.withdraw(1234, 500);
        int expectedResult = 500;
        int actualResult = victim.getBalance();
        testResult(expectedResult, actualResult, "withdrawTest1");
    }

    public void withdrawTest2() {
        CreditCard victim = new CreditCard("122333444455555", 1234, 500, 1000, 0);
        victim.withdraw(1234, 1000);
        int expectedResult = 0;
        int actualResult = victim.getBalance();
        testResult(expectedResult, actualResult, "withdrawTest2");
    }

    public void withdrawTest3() {
        CreditCard victim = new CreditCard("122333444455555", 1234, 500, 1000, 0);
        victim.withdraw(1234, 1000);
        int expectedResult = 500;
        int actualResult = victim.getCreditLimit();
        testResult(expectedResult, actualResult, "withdrawTest3");
    }

    public void depositTest1() {
        CreditCard victim = new CreditCard("122333444455555", 1234, 0, 500, 400);
        victim.deposit(1234, 600);
        int expectedResult = 0;
        int actualResult = victim.getDebtOnCredit();
        testResult(expectedResult, actualResult, "depositTest1");
    }

    public void depositTest2() {
        CreditCard victim = new CreditCard("122333444455555", 1234, 0, 500, 400);
        victim.deposit(1234, 600);
        int expectedResult = 200;
        int actualResult = victim.getBalance();
        testResult(expectedResult, actualResult, "depositTest2");
    }

    public void testResult(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
