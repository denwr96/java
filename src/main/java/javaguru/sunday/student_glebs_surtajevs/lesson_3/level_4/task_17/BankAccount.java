package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_3.level_4.task_17;

public class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String newOwnerFirstName,
                String newOwnerLastName,
                int newMoneyAmount) {
        this.ownerFirstName = newOwnerFirstName;
        this.ownerLastName = newOwnerLastName;
        this.moneyAmount = newMoneyAmount;
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
