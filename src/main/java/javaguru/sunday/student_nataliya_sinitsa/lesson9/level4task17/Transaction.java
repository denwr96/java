package javaguru.sunday.student_nataliya_sinitsa.lesson9.level4task17;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task 17 --> Task 21
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

}

