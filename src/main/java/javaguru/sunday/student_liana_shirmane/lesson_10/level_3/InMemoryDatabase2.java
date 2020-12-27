package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_3;
//task10

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.Optional;
@CodeReview(approved = true)
class InMemoryDatabase2 implements Database2 {
    ArrayList<Product> productList = new ArrayList();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Optional<Product>findByTitle(String productTitle) {
        for (Product product : productList) {
            if (product.getTitle().equals(productTitle)) {
                System.out.println("Product " + productTitle + " is in the list");
                return Optional.of(product);
            }

        }
        return Optional.empty();
    }

    }
