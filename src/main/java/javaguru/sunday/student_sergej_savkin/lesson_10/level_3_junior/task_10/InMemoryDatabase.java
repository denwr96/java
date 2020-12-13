package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_3_junior.task_10;

import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabase implements Database {

    Product[] productArray = new Product[5];

    @Override
    public void save(Product product) {
        for (int i = 0; i < productArray.length; i++) {
            if(productArray[i] == null) {
                productArray[i] = product;
                break;
            }
        }
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        Product resultProduct = null;
        for (int i = 0; i < productArray.length; i++) {
            if(productArray[i].getTitle().equals(productTitle)) {
                resultProduct = productArray[i];
            }
        }
        return Optional.ofNullable(resultProduct);
    }

}
