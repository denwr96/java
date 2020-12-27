package main.java.javaguru.sunday.student_artjom_proshkin.lesson_10.level_3_junior.task_8;

import java.util.ArrayList;
import java.util.List;


class InMemoryDatabase implements Database {

    List<Product> productLibrary = new ArrayList<>();

    @Override
    public void save(Product product) {
        productLibrary.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : productLibrary) {
            if (productTitle.equals(product.getTitle())) {
                return product;
            }
        }
        return null;
    }
}
