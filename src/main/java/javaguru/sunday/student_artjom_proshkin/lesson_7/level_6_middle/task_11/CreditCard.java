package main.java.javaguru.sunday.student_artjom_proshkin.lesson_7.level_6_middle.task_11;

class CreditCard {

    private String cardNumber;
    private int cardPinCode;
    private double balance;
    private double creditLimit;
    private double creditDebt;

    CreditCard(String cardNumber, int cardPinCode) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
        balance = 0;
        creditDebt = 0;
    }

    double getBalance() {
        return balance;
    }

    double getCreditLimit() {
        return creditLimit;
    }

    double getCreditDebt() {
        return creditDebt;
    }

    boolean checkPinCode(int inputPin) {
        if (inputPin == cardPinCode) {
            return true;
        } else {
            System.out.println("Wrong PIN");
            return false;
        }
    }

    void changeCreditLimit(int inputPin, double newCreditLimit) {
        if (checkPinCode(inputPin)) {
            creditLimit = newCreditLimit;
        }
    }

    void withdraw (int inoutPin, double withdrawSum){
        if (checkPinCode(inoutPin)){
            if (withdrawSum <= balance){
                balance = balance - withdrawSum;
            } else if ((withdrawSum - balance + creditDebt) <= creditLimit){
                creditDebt = creditDebt + (withdrawSum - balance);
                balance = 0;
            } else {
                System.out.println("Credit Limit exceeded!");
            }
        }
    }

    void deposit(int inoutPin, double depositSum) {
        if (checkPinCode(inoutPin)) {
            if (creditDebt == 0) {
                balance = balance + depositSum;
            } else if (creditDebt > 0) {
                if (depositSum < creditDebt) {
                    creditDebt = creditDebt - depositSum;
                } else if (depositSum > creditDebt) {
                    balance = creditDebt - depositSum;
                }
            }
        }
    }


}
