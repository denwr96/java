package javaguru.sunday.student_artjom_proshkin.lesson_4.level_6_middle;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Stock {

    String companyName;
    double currentPrice;
    double maxPrice;
    double minPrice;
    String priceInfo;

    Stock (String companyName, double currentPrice){
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        maxPrice = currentPrice;
        minPrice = currentPrice;
    }

    void updatePrice(double newPrice){
        if (newPrice > currentPrice && newPrice > maxPrice){
            maxPrice = newPrice;
        } else if(newPrice < currentPrice && newPrice < minPrice){
            minPrice = newPrice;
        }
        currentPrice = newPrice;

    }

    String getPriceInfo (){
        priceInfo = "Company = " + companyName + ", Current price = " + currentPrice + ", Min price = " + minPrice + ", Nax price = " + maxPrice;
        return priceInfo;
    }

    double getMaxPrice (){
        return maxPrice;
    }

    double getCurrentPrice() {
        return currentPrice;
    }
}

