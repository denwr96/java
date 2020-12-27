package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_3.Task_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Task_8
@CodeReview(approved = true)
public class InMemoryDatabase implements Database {

    List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);

    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }

}
