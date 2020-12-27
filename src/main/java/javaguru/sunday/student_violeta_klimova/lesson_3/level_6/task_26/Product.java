package javaguru.sunday.student_violeta_klimova.lesson_3.level_6.task_26;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Product {

    private final String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double actualPrice() {
        return regularPrice - (regularPrice * discount / 100);
    }

    void printInformation() {
        System.out.println("Product name: " + name);
        System.out.println("Product discount: " + discount);
        System.out.println("Product regular price: " + regularPrice);
        System.out.println("Product actual price: " + actualPrice());
    }

}

class ProductDemo {

    public static void main(String[] args) {
        Product product = new Product("productName");
        product.discount = 20;
        product.regularPrice = 100;

        product.printInformation();
    }

}
