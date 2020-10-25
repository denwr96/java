package main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_6;

public class Stock {
    public String name;
    public int price;
    public int minPrice;
    public int maxPrice;

    public Stock(String name, int price){
        this.name = name;
        this.price = price;
        this.maxPrice = price;
        this.minPrice = price;
    }

    public String getPriceInformation() {
        return "Company = " + name + ", Current Price = " + price + ", Min Price = " + minPrice
                + ", Max Price = " + maxPrice;
    }

    public void updatePrice(int price) {
        this.price = price;
        if (maxPrice < price) {
            maxPrice = price;
        }
        if (minPrice > price) {
            minPrice = price;
        }
    }
}
