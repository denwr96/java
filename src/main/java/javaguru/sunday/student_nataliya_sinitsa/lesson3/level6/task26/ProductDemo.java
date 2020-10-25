package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level6.task26;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDemo {

    public static void main(String[] args) {
        Product beerBox = new Product("beer box");
        beerBox.regularPrice = 20.00;
        beerBox.discount = 33.33;
        beerBox.printInformation();
    }



}
