package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_3.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Coffe", 5.99, 0.05);

        product.actualPrice();
        product.printInformation();

    }
}
