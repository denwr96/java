package main.java.javaguru.sunday.student_kristina_sutugina.lesson_7.level_6;
//Task_11
class CreditCard {

    private int cardNumber;
    private int pinCode;
    private int balance;
    private int creditLimit;
    private int loanDebt;

    public CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.loanDebt = 0;
    }

    public CreditCard(int cardNumber, int pinCode, int creditLimit) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.creditLimit = creditLimit;
    }

    public int getPinCode() {
        return pinCode;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getBalance() {
        return balance;
    }

    public int getLoanDebt() {
        return loanDebt;
    }

    public void withdraw(int pinCode, int amount) {
        if (checkPinCode(pinCode)) {
            if (balance > 0) {
                balance = balance - amount;
                System.out.println("Balance" + balance);
                if (balance < 0) {
                    loanDebt = -balance;
                    System.out.println("Loan debt " + loanDebt);
                }
            } else if (balance < 0 && creditLimit > loanDebt) {
                loanDebt = loanDebt + amount;
                System.out.println("Loan debt " + loanDebt);
            } else if (balance == 0 && creditLimit > loanDebt) {
                if (loanDebt == 0 && amount > creditLimit) {
                    System.out.println("Not enough account funds");
                } else {
                    loanDebt = loanDebt + amount;
                    System.out.println("Loan debt " + loanDebt);
                }
            } else {
                System.out.println("Not enough account funds");
            }
        } else {
            System.out.println("Wrong pin code");
        }
    }

    public void deposit(int pinCode, int amount) {
        if (checkPinCode(pinCode)) {
            if (loanDebt > 0) {
                loanDebt = loanDebt - amount;
                System.out.println("Loan debt " + loanDebt);
                if (loanDebt < 0) {
                    balance = balance + (-loanDebt);
                    System.out.println("Balance " + balance);
                }
            } else if (loanDebt < 0) {
                balance = balance + amount;
                System.out.println("Balance " + balance);
            } else if (loanDebt == 0) {
                balance = +balance + amount;
                System.out.println("Balance " + balance);
            }
        } else {
            System.out.println("Wrong pin code");
        }

    }

    public boolean checkPinCode(int pin) {
        if (pinCode == pin) {
            return true;
        }
        return false;
    }

    public void changeLimit(int pin, int limit) {
        if (checkPinCode(pinCode)) {
            this.creditLimit = limit;
        } else {
            System.out.println("Wrong pin code");
        }
    }
}
