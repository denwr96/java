package main.java.javaguru.sunday.student_deniss_lobacs.lesson_7.level_6_middle.task11;

public class CreditCard {

    private int cardNumber;
    private int cardPin;
    private double balance = 0;
    private double creditDebt = 0;
    double creditLimit;

    CreditCard(int cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.cardPin = pin;
    }

    public void makeDeposit(int pin, double depositAmount) {
        if (pin == cardPin) {
            if (depositAmount > creditDebt) {
                balance = balance + depositAmount - creditDebt;
                creditDebt = 0;
            } else {
                creditDebt = creditDebt - depositAmount;
            }
        } else {
            System.out.println("Incorrect pin");
        }
    }

    public void makeWithdraw(int pin, double withdrawAmount) {
        if (pin == cardPin) {
            if (withdrawAmount > balance) {
                double newDebt = creditDebt + (withdrawAmount - balance);
                if (newDebt > creditLimit) {
                    System.out.println("Операция отколена");
                } else {
                    creditDebt = newDebt;
                    balance = 0;
                }
            } else {
                balance = balance - withdrawAmount;
            }
        } else {
            System.out.println("Incorrect pin!");
        }
    }

    public void printInfo() {
        System.out.println("Balance: " + getBalance() + " |" + " Debt: " + getCreditDebt());
    }


    public double getBalance() {
        return balance;
    }


    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCreditDebt() {
        return creditDebt;
    }
}
