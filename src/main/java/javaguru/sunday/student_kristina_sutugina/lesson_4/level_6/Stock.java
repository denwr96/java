package javaguru.sunday.student_kristina_sutugina.lesson_4.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Stock {
    public String name;
    public int currentPrice;
    public int minPrice;
    public int maxPrice;

    Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (currentPrice > minPrice && currentPrice < maxPrice) {
            currentPrice = newPrice;
        }
    }

    String getPriceInformation() {
        return "Company = " + this.name + ", Current Price = " + this.currentPrice + ", Min Price = " + this.minPrice +
                ", Max Price = " + this.maxPrice;
    }
    int getMaxPrice(){
        return this.maxPrice;
    }
}
