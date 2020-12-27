package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

// Task 33 (level 6)

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }
}
