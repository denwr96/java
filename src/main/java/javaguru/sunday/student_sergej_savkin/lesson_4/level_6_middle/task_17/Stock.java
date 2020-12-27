package javaguru.sunday.student_sergej_savkin.lesson_4.level_6_middle.task_17;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Stock {

    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;
    String priceInformation;

    public Stock(String companyName, int currentPrice){
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice){
        if(newPrice < currentPrice && minPrice > newPrice){
            minPrice = newPrice;
        } else if(newPrice > currentPrice && maxPrice < newPrice) {
            maxPrice = newPrice;
        }
        currentPrice = newPrice;

    }

    public String getPriceInformation(){
        priceInformation = "Company = " + companyName + ", " + "Current Price = " + currentPrice + ", " + "Min Price = " + minPrice + ", " + "Max Price = " + maxPrice;
        return priceInformation;
    }
    public int getMaxPrice(){
        return maxPrice;
    }
    public int getMinPrice(){
        return minPrice;
    }
/*
    public static void main(String[] args) {
        Stock google = new Stock("Google", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    } */

}
