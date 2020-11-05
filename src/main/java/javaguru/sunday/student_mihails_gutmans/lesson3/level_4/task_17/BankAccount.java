package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_4.task_17;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    int moneyAmount;

    BankAccount(String enterOwnerFirstName,String enterOwnerLastName , int enterMoneyAmount) {

        this.ownerFirstName = enterOwnerFirstName;
        this.ownerLastName = enterOwnerLastName;
        this.moneyAmount = enterMoneyAmount;
    }

    String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerLastName;
    }

    int getMoneyAmount() {
        return this.moneyAmount;
    }
}
