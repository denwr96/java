package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_6.task_17;

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

    double updatePrice(double currentPrice){
        this.currentPrice = currentPrice;

        if (currentPrice < minPrice){
            minPrice = currentPrice;
            return minPrice;
        }
        if (currentPrice > maxPrice){
            maxPrice = currentPrice;
            return maxPrice;
        }
        return currentPrice;
    }

    public String getPriceInformation(){
        String info = "Company name: " + companyName + ", Current price = " + currentPrice + " €, Min price = " + minPrice + " €, Max price = " + maxPrice + " €";
        return info;
    }

}

