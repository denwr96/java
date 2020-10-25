package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_6.task_27;

public class BankAccount {

    String theOwner;
    int theMoney;

    BankAccount(String owner , int money) {
        this.theOwner = owner;
        this.theMoney = money;
    }

    String getOwner() {
        return this.theOwner ;
    }

    int getMoney() {
        return this.theMoney;
    }

}
