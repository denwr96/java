package main.java.javaguru.sunday.student_natalia_kochkina.lesson_7.level_6.CreditCard;

//Task_11

public class CreditCard {

    private int numberOfCard;
    private int pinCode;
    public int cardBalance;
    public int creditLimit;
    public int creditDebt;

    public CreditCard(int numberOfCard, int pinCode) {
        this.numberOfCard = numberOfCard;
        this.pinCode = pinCode;
        this.cardBalance = 0;
        this.creditDebt = 0;
    }

    public void deposit (int usersPinCode, int amount) {
        if (usersPinCode == pinCode) {
            if (creditDebt == 0) {
                cardBalance = cardBalance + amount;
            } else if (creditDebt < amount) {
                cardBalance = amount - creditDebt;
                creditDebt = 0;
            } else {
                creditDebt = creditDebt - amount;
            }
        } else {
            System.out.println("PIN is false");
        }
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public  int getCreditDebt() {
        return  creditDebt;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int changeCreditLimit(int amount) {
        creditLimit = amount;
        return creditLimit;
    }

    public void withdraw (int usersPinCode, int amount) {
        if (usersPinCode == pinCode) {
            if (cardBalance >= amount) {
                cardBalance = cardBalance - amount;
            } else if ((amount + creditDebt) <= creditLimit) {
                creditDebt = creditDebt + amount;
            } else {
                System.out.println("transaction rejected");
            }
        } else {
            System.out.println("PIN is false");
        }
    }
}
