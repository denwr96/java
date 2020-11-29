package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_1_intern.task5;

public class SafeV2 {
    private int pinCode;
    private int moneyAmount;

    public SafeV2(int pinCode , int moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void putMoneyAmount(int pinCode, int moneyAmount) {
        if (pinCode == this.pinCode) {
            this.moneyAmount = moneyAmount;
        }
    }
}
