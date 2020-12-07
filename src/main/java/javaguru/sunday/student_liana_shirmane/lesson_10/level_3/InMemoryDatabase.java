package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_3;
//task8

import java.util.ArrayList;

class InMemoryDatabase implements Database {
    ArrayList<Product> productList = new ArrayList;

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (productTitle:productList; {

        }
        return null;
    }
}
