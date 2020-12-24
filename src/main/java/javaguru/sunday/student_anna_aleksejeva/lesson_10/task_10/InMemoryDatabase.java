package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CodeReview(approved = true)
public class InMemoryDatabase {

    private List<Product> prodDatabase = new ArrayList<>();

    public void save(Product product) {
        prodDatabase.add(product);
    }

    public Optional<Product> findByTitle (String productTitle) {
        for (Product product : prodDatabase) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
