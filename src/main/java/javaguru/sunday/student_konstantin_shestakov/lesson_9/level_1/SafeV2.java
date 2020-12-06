package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 5
@CodeReview(approved = true)
class SafeV2 {

    private int pin = 1234;
    private double moneyAmount;
    private boolean isLogin = false;

    SafeV2 (int pin, double moneyAmount) {
        this.pin = pin;
        this.moneyAmount = moneyAmount;
    }

    boolean isLogin(int inputPin) {
        if (inputPin == pin) {
            isLogin = true;
        } else {
            isLogin = false;
        }
        return isLogin;
    }

    public double getMoney(double withdraw) {
        if (isLogin) {
            return moneyAmount -= withdraw;
        } else {
            System.out.println("Incorrect pin");
            return moneyAmount;
        }
    }

    public double putMoney(double deposit) {
        if (isLogin) {
            return moneyAmount += deposit;
        } else {
            System.out.println("Incorrect pin");
            return moneyAmount;
        }
    }

    void Info () {
        System.out.println("Balance = " + moneyAmount);
    }
}
