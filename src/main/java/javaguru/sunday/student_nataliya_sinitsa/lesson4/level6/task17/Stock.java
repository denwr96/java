package javaguru.sunday.student_nataliya_sinitsa.lesson4.level6.task17;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Stock {

    String name;
    double currentPrice;
    double minPrice;
    double maxPrice;

    public void updatePrice(double updatedPrice) {
        if (updatedPrice < minPrice) {
            minPrice = updatedPrice;
            currentPrice = updatedPrice;
        } else if (updatedPrice > maxPrice) {
            maxPrice = updatedPrice;
            currentPrice = updatedPrice;
        } else {
            currentPrice = updatedPrice;
        }
    }

    public String getPriceInformation() {
        return "Company = " + name + ", Current Price = " + currentPrice +
                ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }

    Stock (String companyName, double productCurrentPrice) {
        this.name = companyName;
        this.currentPrice = productCurrentPrice;
        this.minPrice = productCurrentPrice;
        this.maxPrice = productCurrentPrice;
    }

}
