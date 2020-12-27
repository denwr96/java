package javaguru.sunday.student_nataliya_sinitsa.lesson9.level1.task4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Safe {

    public int pinCode;
    public double moneyAmount;


    public int getPinCode() {
        return pinCode;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    Safe(int pinCode, double moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

}
