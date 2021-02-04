package javaguru.sunday.student_sergej_savkin.lesson_7.level_6_middle.task_11;


import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CreditCard {

    private int creditCardNumber;
    private int pinCode;
    private int balance = 0;
    private int creditLimit;
    private int creditDebt = 0;

    CreditCard(int creditCardNumber, int pinCode){
        this.creditCardNumber = creditCardNumber;
        this.pinCode = pinCode;
    }

    public boolean checkPinCode(int cardPinCode) {
        if (pinCode == cardPinCode){
            return true;
        }
        return false;
    }

    public void setNewCreditLimit(int cardPinCode, int newCreditLimit) {
        if (checkPinCode(cardPinCode)) {
            creditLimit = newCreditLimit;
        } else {
            System.out.println("Pin code is wrong");
        }
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getBalance(){
        return balance;
    }

    public int getCreditDebt(){
        return creditDebt;
    }

    public void makeWithdraw(int cardPinCode, int sumToWithdraw) {
        if (checkPinCode(cardPinCode)) {
            if (creditLimit >= (sumToWithdraw - balance - creditDebt)) {
                if (sumToWithdraw <= balance) {
                    balance -= sumToWithdraw;
                } else {
                    creditDebt = sumToWithdraw - balance;
                    balance = 0;
                }
            } else {
                System.out.println("Credit limit exceeded");
            }
        } else {
            System.out.println("Pin code is wrong!");
        }
    }

    public void makeDeposit(int cardPinCode, int depositSum){
        if (checkPinCode(cardPinCode)) {
            if(depositSum > creditDebt) {
                balance = balance + depositSum - creditDebt;
                creditDebt = 0;
            } else {
                creditDebt = creditDebt - depositSum;
            }
        } else {
            System.out.println("Pin code is wrong!");
        }
    }

}
