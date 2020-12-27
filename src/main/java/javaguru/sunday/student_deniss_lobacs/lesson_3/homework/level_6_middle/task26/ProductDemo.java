package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_6_middle.task26;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product("Milk");

        product.discount = 10.00;
        product.regularPrice = 5000.00;

        System.out.print("Discount price: ");
        product.printInformation();
    }
}
