package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_9.task_17;

class Transaction {

    private Trader trader;
    private int amount;


    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}