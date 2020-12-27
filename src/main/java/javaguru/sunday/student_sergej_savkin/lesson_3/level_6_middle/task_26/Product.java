package javaguru.sunday.student_sergej_savkin.lesson_3.level_6_middle.task_26;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name){
        this.name = name;
    }
    double actualPrice(){
        double actualPrice = regularPrice - (regularPrice * (discount / 100));
        return actualPrice;
    }
    void printInformation(){
        System.out.println("Actual price is " + actualPrice());
    }
}
