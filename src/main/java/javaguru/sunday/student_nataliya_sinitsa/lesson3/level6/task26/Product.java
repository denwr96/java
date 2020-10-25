package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level6.task26;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Product {

    String name;
    double regularPrice;
    double discount; // NB! %

    public void printInformation () {
        double actualPrice = regularPrice - regularPrice * discount / 100;
        System.out.println(name + " actual price is: " + actualPrice +
                "(regular price: " + regularPrice + ", discount (%): " + discount + ")");
    }


    Product (String productName) {
        this.name = productName;
    }

}
