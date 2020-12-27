package javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_11;

import java.util.Scanner;

class CreditCard {
    String cardNumber;
    int pinCode;
    int balance;
    int creditLimit;
    int debtOnCredit;

    public CreditCard(String cardNumber, int pinCode, int balance, int creditLimit, int debtOnCredit) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.debtOnCredit = debtOnCredit;
    }

    Scanner myScanner = new Scanner(System.in);

    public boolean PinCodeApproval(int pinCode) {
        System.out.println("Please enter your PIN");
        int enteredPinCode = myScanner.nextInt();
        return pinCode == enteredPinCode;
    }

    public void withdraw(int pinCode, int sumOfMoney) {
        if (PinCodeApproval(pinCode)) {
            if (sumOfMoney < balance) {
                balance = balance - sumOfMoney;
            } else if (sumOfMoney > balance && creditLimit > 0) {
                debtOnCredit = sumOfMoney - balance;
                creditLimit = creditLimit - debtOnCredit;
                balance = 0;
            } else {
                System.out.println("Refusal");
            }
        } else {
        System.out.println("Refusal");
    }
}

    public void deposit(int pinCode, int sumOfMoney) {
        if (PinCodeApproval(pinCode)) {
            if (sumOfMoney - debtOnCredit == 0) {
                debtOnCredit = 0;
            } else if (sumOfMoney - debtOnCredit > 0) {
                balance = sumOfMoney - debtOnCredit;
                debtOnCredit = 0;
            }
        } else {
            System.out.println("Refusal");
        }
    }

    public void printInformation() {
        System.out.println("Balance " + getBalance());
        System.out.println("Credit limit " + getCreditLimit());
        System.out.println("Debt on credit " + getDebtOnCredit());
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getDebtOnCredit() {
        return debtOnCredit;
    }
}
