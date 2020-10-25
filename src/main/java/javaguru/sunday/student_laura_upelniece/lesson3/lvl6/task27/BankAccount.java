package main.java.javaguru.sunday.student_laura_upelniece.lesson3.lvl6.task27;

class BankAccount {

     String owner;
     int money;

    BankAccount(String accountOwner, int moneyAmount) {
        this.owner = accountOwner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}
