package javaguru.sunday.student_nataliya_sinitsa.lesson9.level1.task5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SafeV2 {

    public int pinCode;
    public double moneyAmount;

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public double putMoney(int pinCode, double moneyAmountToPut) {
        if (pinCode == this.pinCode) {
            moneyAmount = moneyAmount + moneyAmountToPut;
        }
        return moneyAmount;
    }

    public double getMoney(int pinCode, double moneyAmountToGet) {
        if (pinCode == this.pinCode && moneyAmountToGet <= moneyAmount) {
            moneyAmount = moneyAmount - moneyAmountToGet;
        }
        return moneyAmount;
    }

    SafeV2 (int pinCode, double moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

}
