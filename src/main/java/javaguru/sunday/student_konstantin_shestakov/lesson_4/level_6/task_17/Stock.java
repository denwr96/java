package javaguru.sunday.student_konstantin_shestakov.lesson_4.level_6.task_17;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Метод updatePrice не должен возвращать значение.")
class Stock {

    String companyName;
    double currentPrice;
    double minPrice;
    double maxPrice;

    Stock(String companyName, double currentPrice, double minPrice, double maxPrice){
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    void updatePrice(double currentPrice){
        this.currentPrice = currentPrice;

        if (currentPrice < minPrice){
            minPrice = currentPrice;
        }
        if (currentPrice > maxPrice){
            maxPrice = currentPrice;
        }
    }

    public String getPriceInformation(){
        String info = "Company name: " + companyName + ", Current price = " + currentPrice + " €, Min price = " + minPrice + " €, Max price = " + maxPrice + " €";
        return info;
    }

}

