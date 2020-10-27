package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_4;

public class Stock {

    private String name;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String name, int currentPrice ) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }
    public void updatePrice (int newPrice) {
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice<minPrice) {
            minPrice = newPrice;
        }
    }
    public void printInformation() {
        System.out.println(" Name: " + name);
        System.out.println("CurrentPrice: " + currentPrice);
        System.out.println(" Min price: " + minPrice);
        System.out.println(" Max price: " + maxPrice);


    }
}
