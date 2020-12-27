package javaguru.sunday.student_jelena_lavrenuka.lesson_4.task_17;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
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
        System.out.println("Name: " + companyName);
        System.out.println("Current Price:" + currentPrice);
        System.out.println("Max price: " + maxPrice);
        System.out.println("Min price: " + minPrice);
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
