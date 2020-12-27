package javaguru.sunday.teacher.lesson_5.lessoncode.stock;

public class Stock {

    private String name;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }

    public void printInformation() {
        System.out.println("Name: " + name);
        System.out.println("Current price: " + currentPrice);
        System.out.println("Max price: " + maxPrice);
        System.out.println("Min price: " + minPrice);
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }
}
