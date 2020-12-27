package javaguru.sunday.student_laura_upelniece.lesson3.lvl6.task26;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product shoes = new Product("Nike");
        shoes.printInformation();
        shoes.regularPrice = 50;
        shoes.discount = 10;
        shoes.actualPrice();
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
        shoes.printInformation();

    }
}
