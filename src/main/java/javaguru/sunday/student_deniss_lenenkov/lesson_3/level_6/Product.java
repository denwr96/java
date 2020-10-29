package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_3.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name, double regularPrice, double discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double discountInPercentage(){
        double discountInPercentage = discount * 100;
        return discountInPercentage;
    }
     double actualPrice(){
        double result = regularPrice - regularPrice * discount;
        return result;


    }
    void printInformation(){
        System.out.println("name: " + name);
        System.out.println("Regular price: " + regularPrice);
        System.out.println("Discount: " + discountInPercentage() + "%");
        System.out.println("Actual price: " + actualPrice());

    }


}
