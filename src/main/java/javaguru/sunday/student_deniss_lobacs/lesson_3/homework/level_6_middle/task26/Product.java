package main.java.javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_6_middle.task26;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Product {
    String name;
    double regularPrice;
    double discount;

     Product(String name) {
        this.name = name;
    }

    double actualPrice() {

        double result = regularPrice -  ( regularPrice / 100 ) * discount;
        return result;
    }

    void printInformation() {
        System.out.println(actualPrice());
    }

}
