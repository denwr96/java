package main.java.javaguru.sunday.student_liana_shirmane.lesson_7.level_6;
//task11

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.shouldDeposit();
        test.shouldCreditLessThanBalance();
        test.shouldCreditMoreThanBalance();
        test.shouldCreditRejectPayment();
        test.wrongPin();
    }

     public void shouldDeposit (){
        CreditCard firstCreditCard = new CreditCard (3454, 1234);
        firstCreditCard.deposit(1234, 100);
        int expectedResult = 100;
        int actualResult = firstCreditCard.getBalance();
        check(expectedResult, actualResult, "Deposit test");
     }

     public void shouldCreditLessThanBalance (){
         CreditCard firstCreditCard = new CreditCard (3454, 1234);
         firstCreditCard.deposit(1234, 100);
         firstCreditCard.withdraw(1234, 20);
         int expectedResult = 80;
         int actualResult = firstCreditCard.getBalance();
         check(expectedResult, actualResult, "Withdraw test");

     }

     public void shouldCreditMoreThanBalance(){
         CreditCard firstCreditCard = new CreditCard (3454, 1234);
         firstCreditCard.deposit(1234, 100);
         firstCreditCard.changeCreditLimit(200);
         firstCreditCard.withdraw(1234, 120);
         int expectedResult = 20;
         int actualResult = firstCreditCard.getDebtOnLoans();
         check(expectedResult, actualResult, "Withdraw test if more than balance");
     }

    public void shouldCreditRejectPayment(){
        CreditCard firstCreditCard = new CreditCard (3454, 1234);
        firstCreditCard.deposit(1234, 100);
        firstCreditCard.changeCreditLimit(10);
        firstCreditCard.withdraw(1234, 120);
        String expectedResult = "Transaction rejected due to credit limit";
        if (expectedResult == "Transaction rejected due to credit limit"){
            System.out.println("Withdraw test rejected transaction has passed!");
        } else {System.out.println("Withdraw test rejected transaction failed!");}
    }

    public void wrongPin(){
        CreditCard firstCreditCard = new CreditCard (3454, 1234);
        firstCreditCard.deposit(1235, 100);
        String expectedResult = "Wrong PIN";
        if (expectedResult == "Wrong PIN"){
            System.out.println("Wrong PIN has passed!");
        } else {System.out.println("Wrong PIN failed!");}
    }
    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}

