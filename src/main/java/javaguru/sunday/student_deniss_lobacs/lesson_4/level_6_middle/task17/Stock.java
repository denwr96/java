package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_6_middle.task17;

public class Stock {

    private String name;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String name , int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public String getPriceInformation() {
        String info = "Company: " + name + ", Current price: " + currentPrice + ", Min price: " + minPrice + ", Max Price: " + maxPrice;
        return info;
    }

    public void updatePrice(int currentPrice) {
        if (currentPrice > this.maxPrice) {
            this.maxPrice = currentPrice;
        }
        if (currentPrice < this.minPrice) {
            this.minPrice = currentPrice;
        }
        this.currentPrice = currentPrice;
    }

    int getMaxPrice (){
        return maxPrice;
    }

    int getCurrentPrice() {
        return currentPrice;
    }
}
