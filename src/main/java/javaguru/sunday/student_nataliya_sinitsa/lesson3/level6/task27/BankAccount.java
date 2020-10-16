package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level6.task27;

class BankAccount {

    String owner;
    int money;

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

    BankAccount (String ownerFirstName, int moneyAmount) {
        this.owner = ownerFirstName;
        this.money = moneyAmount;
    }

}
