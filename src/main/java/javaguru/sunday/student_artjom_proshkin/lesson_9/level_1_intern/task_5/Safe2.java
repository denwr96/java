package javaguru.sunday.student_artjom_proshkin.lesson_9.level_1_intern.task_5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Safe2 {

    private int pinCode;
    private int moneyAmount;

    Safe2(int pinCode, int moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    boolean checkPinCode(int inputPin) {
        if (inputPin == pinCode) {
            return true;
        } else {
            System.out.println("Wrong PIN");
            return false;
        }
    }

    public void getMoney(int inputPin, int moneyToGet) {
        if (checkPinCode(inputPin)) {
            if (moneyToGet < moneyAmount) {
                moneyAmount -= moneyToGet;
            } else {
                moneyAmount = 0;
            }
        }
    }

    public void putMoney(int inputPin, int moneyToPut) {
        if (checkPinCode(inputPin)) {
            moneyAmount += moneyToPut;
        }
    }
}
