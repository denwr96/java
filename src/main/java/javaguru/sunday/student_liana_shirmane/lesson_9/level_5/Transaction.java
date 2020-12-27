package javaguru.sunday.student_liana_shirmane.lesson_9.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

//task17
//task18
@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader(){
        return trader;
    }
    public int getAmount(){
        return amount;
    }
}