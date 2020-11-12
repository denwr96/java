package main.java.javaguru.sunday.student_natalia_kochkina.lesson_7.level_6.CreditCard;

//Task_11

public class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.shouldPutMoneyOnTheCard1();
        creditCardTest.shouldPutMoneyOnTheCard2();
        creditCardTest.shouldChangeCardBalance();
    }

    public void shouldPutMoneyOnTheCard1() {
        CreditCard myFirstCreditCard = new CreditCard(12345, 1234);
        myFirstCreditCard.deposit(1234, 10);
        int expectedBalance = 10;
        int cardBalance = myFirstCreditCard.getCardBalance();
        if (expectedBalance == cardBalance) {
            System.out.println("Deposit test 1 OK");
        } else {
            System.out.println("Deposit test 1 FAILED");
        }
    }

    public void shouldPutMoneyOnTheCard2() {
        CreditCard myFirstCreditCard = new CreditCard(12345, 1234);
        myFirstCreditCard.changeCreditLimit(25);
        myFirstCreditCard.withdraw(1234, 20);
        myFirstCreditCard.deposit(1234, 30);
        int cardBalance = myFirstCreditCard.getCardBalance();
        int expectedBalance = 10;
        if (expectedBalance == cardBalance) {
            System.out.println("Deposit test 2 OK");
        } else {
            System.out.println("Deposit test 2 FAILED");
        }
    }

    public void shouldChangeCardBalance() {
        CreditCard myFirstCreditCard = new CreditCard(12345, 1234);
        myFirstCreditCard.changeCreditLimit(10);
        myFirstCreditCard.withdraw(1234, 8);
        int cardBalance = myFirstCreditCard.getCardBalance();
        int creditDebt = myFirstCreditCard.getCreditDebt();
        int expectedBalance = 0;
        int expectedDebt = 8;
        if ((cardBalance == expectedBalance) && (creditDebt == expectedDebt)) {
            System.out.println("Withdraw test is OK");
        } else {
            System.out.println("Withdraw test is FAILED");
        }
    }
}
