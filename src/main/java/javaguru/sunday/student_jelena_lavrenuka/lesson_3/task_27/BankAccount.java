package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_27;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}
