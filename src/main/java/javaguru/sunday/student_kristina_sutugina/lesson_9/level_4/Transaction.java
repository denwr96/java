package javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;

//33
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
        return "Transaction {" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }
}