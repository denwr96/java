package main.java.javaguru.sunday.teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class MenuExample {

    public static void main(String[] args) {
        System.out.println("1 -> Add Product");
        System.out.println("2 -> Delete Product");
        System.out.println("3 -> Find Product");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        ProductCatalog productCatalog = new ProductCatalog();
        switch (userInput) {
            case 1:
                productCatalog.addProduct(new Product());
            case 2:
                productCatalog.deleteProduct(new Product());
                break;
            case 3:
                System.out.println("Your input is 3");
                break;
            default:
                System.out.println("Unknown input");
        }
    }
}
