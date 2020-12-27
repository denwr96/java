package javaguru.sunday.student_liana_shirmane.lesson_7.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

//task11
@CodeReview(approved = true)
public class CreditCard {

    int cardNumber;
    int cardCode;
    int balance;
    int creditLimit;
    int debtOnLoans;

    public CreditCard(int cardNumber, int cardCode) {
        this.cardNumber = cardNumber;
        this.cardCode = cardCode;
        this.balance = 0;
        this.debtOnLoans = 0;
    }

    public void deposit(int userCardCode, int amount) {
        if (userCardCode == cardCode) {
            if (debtOnLoans > 0) {
                if (amount > debtOnLoans) {
                    balance = debtOnLoans - amount;
                } else if (amount < debtOnLoans) {
                    debtOnLoans = debtOnLoans - amount;
                }
            } else if (debtOnLoans == 0) {
                balance = balance + amount;
            }
        } else {
            System.out.println("Wrong PIN");
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getDebtOnLoans() {
        return debtOnLoans;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int changeCreditLimit(int amount) {
        creditLimit = amount;
        return creditLimit;
    }

    public void withdraw(int userCardCode, int amount) {
        if (userCardCode == cardCode) {
            if (amount <= balance) {
                balance = balance - amount;
            } else if ((amount - balance + debtOnLoans) <= creditLimit) {
                    debtOnLoans = debtOnLoans + (amount - balance);
                    balance = 0;
                } else {
                    System.out.println("Transaction rejected due to credit limit");
                }
        } else {
            System.out.println("Wrong PIN");
        }
    }
}




