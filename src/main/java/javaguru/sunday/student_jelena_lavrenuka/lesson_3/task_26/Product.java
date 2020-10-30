package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_26;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Product {
    String name;
    double regularPrice;
    double discount;
    double newPrice;

    Product (double regularPrice, double discount){
        this.name = "CocaCola";
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice(){
        double discountAmount = (regularPrice * discount)/100;
        double newPrice = regularPrice - discountAmount;
        return newPrice;
    }

    void printInformation(){
        System.out.println(this.name);
        System.out.println("Discount is " + discount + '%');
        System.out.println("New price is " + actualPrice());
    }
}
