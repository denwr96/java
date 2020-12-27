package javaguru.sunday.student_nataliya_sinitsa.lesson7.level6.task11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CreditCard {

    String cardNumber;
    int cardPinCode;
    double balance;
    double creditLimit;
    double creditDefault;

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCreditDefault() {
        return creditDefault;
    }

    CreditCard(String cardNumber, int cardPinCode) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
        balance = 0;
        creditDefault = 0;
    }

    public void withdraw(int enteredPinCode, double withdrawAmount) {
        if (enteredPinCode == cardPinCode) {
            if (withdrawAmount < balance) {
                balance = balance - withdrawAmount;
            } else if (creditDefault - balance + withdrawAmount < creditLimit) {
                creditDefault = creditDefault - balance + withdrawAmount;
                balance = 0;
            } else {
                System.out.println("ERROR! Limit exceeded!");
            }
        } else {
            System.out.println("PIN code is incorrect!");
        }
    }

    public void deposit(int enteredPinCode, double depositAmount) {
        if (enteredPinCode == cardPinCode) {
            if (creditDefault > 0 && creditDefault > depositAmount) {
                creditDefault = creditDefault - depositAmount;
            } else if (creditDefault > 0 && creditDefault < depositAmount) {
                balance = balance + depositAmount - creditDefault;
                creditDefault = 0;
            } else {
                balance = balance + depositAmount;
            }
        } else {
            System.out.println("PIN code is incorrect!");
        }
    }

}
