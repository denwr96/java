package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_6;
//task33

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

    @Override
    public String toString(){
            return "Transaction details: " + trader + '\'' +
                    ", amount ='" + amount + '\'';
        }
}