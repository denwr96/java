package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Task 8
@CodeReview(approved = true)
class InMemoryDatabase implements Database {

    private List<Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Optional<Product> findByTitle (String productTitle) {
        for (Product productInList : productList) {
            if (productInList.getTitle().equals(productTitle)) {
                return Optional.of(productInList);
            }
        }
        return Optional.empty();
    }

}
