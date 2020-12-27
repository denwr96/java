package javaguru.sunday.student_liana_shirmane.lesson_3.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

//task26
@CodeReview(approved = true)
class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double discountInProc() {
        double discountInProc = discount * 100;
        return discountInProc;
    }

    double actualPrice() {
        double result = regularPrice - regularPrice * discount;
        return result;
    }

    void printInformation() {
        System.out.println(name + " price before: " + regularPrice + ", discount: " + discountInProc() + "%" + ", new price: " + actualPrice());
    }
}
