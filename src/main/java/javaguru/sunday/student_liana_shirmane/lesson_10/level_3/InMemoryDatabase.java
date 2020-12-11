package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_3;
//task8

import java.util.ArrayList;
import java.util.Collections;

class InMemoryDatabase implements Database {
    ArrayList<Product> productList = new ArrayList();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getTitle().equals(productTitle)) {
                System.out.println("Product " + productTitle + " is in the list");
                return productList.get(i);
            }

        }
        return null;
    }
}
