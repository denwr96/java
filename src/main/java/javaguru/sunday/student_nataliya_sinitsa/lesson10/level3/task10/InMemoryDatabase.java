package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task10;

import java.util.ArrayList;
import java.util.Optional;

//Task 8
class InMemoryDatabase implements Database {

    private ArrayList<Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Optional findByTitle (String productTitle) {
        for (Product productInList : productList) {
            if (productInList.getTitle().equals(productTitle)) {
                return Optional.of(productInList);
            }
        }
        return Optional.empty();
    }

}
