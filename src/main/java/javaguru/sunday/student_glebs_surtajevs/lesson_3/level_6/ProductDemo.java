package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_3.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("Steak", 9.00, 0.3);
        product.printInformation();
    }
}
