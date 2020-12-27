package javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Transaction {

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Transaction() {

    }

    private Trader trader;
    private int amount;

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }
}
