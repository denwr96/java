package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_7_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class InMemoryDatabase implements Database {

   private List<Product> prodDatabase = new ArrayList<>();

    @Override
    public void save(Product product) {
        prodDatabase.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : prodDatabase) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }


}
