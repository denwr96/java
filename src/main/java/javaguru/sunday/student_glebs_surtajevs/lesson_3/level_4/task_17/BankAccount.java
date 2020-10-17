package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_3.level_4.task_17;

public class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String OwnerFirstName,
                String OwnerLastName,
                int MoneyAmount) {
        this.ownerFirstName = OwnerFirstName;
        this.ownerLastName = OwnerLastName;
        this.moneyAmount = MoneyAmount;
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
