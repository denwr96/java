package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_1_intern.task_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Не совсем понятно, зачем вы что-то возвращаете из методов, если никак не используете эти значения?")
class StongboxV2 {

    private int pincode;
    private int moneyAmount;

    public StongboxV2(int pincode, int moneyAmount) {
        this.pincode = pincode;
        this.moneyAmount = moneyAmount;
    }

    public int putMoneyAmount(int pincode, int moneyAmountToPut) {
        if (this.pincode == pincode) {
            moneyAmount += moneyAmountToPut;
            return moneyAmount;
        } else {
            System.out.println("Pincode is wrong!");
        }
        return 0;
    }

    public int getMoneyFromStrongBox(int pincode, int moneyAmountToGet) {
        if (this.pincode == pincode) {
            if (moneyAmountToGet <= moneyAmount) {
                moneyAmount -= moneyAmountToGet;
                return moneyAmount;
            } else {
                System.out.println("You don't have so much money!");
            }
        } else {
            System.out.println("Pincode is wrong");
        }
        return 0;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}
