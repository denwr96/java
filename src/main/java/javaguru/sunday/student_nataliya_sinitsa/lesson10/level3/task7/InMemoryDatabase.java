package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task7;

import java.util.ArrayList;
import java.util.List;

//Task 8
class InMemoryDatabase implements Database {

    private List<Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product productInList : productList) {
            if (productInList.getTitle().equals(productTitle)) {
                return productInList;
            }
        }
        return null;
    }

}
