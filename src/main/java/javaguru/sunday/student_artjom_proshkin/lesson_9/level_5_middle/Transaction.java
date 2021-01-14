package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;


import javaguru.sunday.teacher.annotations.CodeReview;

//Task_17
//Task_33
@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

    Transaction (Trader trader, int amount){
        this.trader = trader;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction {" +
                "Trader= " + trader +
                ", amount=" + amount +
                '}';
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}
