package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_3.Task_8;

import java.util.ArrayList;
import java.util.Objects;

//Task_8

public class InMemoryDatabase implements Database {

    ArrayList<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);

    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product productOne: products) {
            String productOneTitle = productOne.getTitle();
            boolean containsProduct = productOneTitle.equals(productTitle);
            if (containsProduct) {
                return productOne;
            }
        }
        return null;
    }

}
