package main.java.javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_6_middle.task27;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankAccount {

    String owner;
    int money;

    BankAccount(String owner , int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    String getMoney() {
        return String.valueOf(this.money);
    }

    void setMoney(int money) {
        this.money = money;
    }

}