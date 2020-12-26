package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level5task22;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task 23 --> Task 33
@CodeReview(approved = true)
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

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }
}
