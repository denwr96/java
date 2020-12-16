package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_10;

// lesson_10 task_7
// lesson_10 task_8
// lesson_10 task_10

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.Optional;
@CodeReview(approved = false)
@CodeReviewComment(comment = "Используйте интерфейс List<>. Не стоит привязываться к конкретной имплементации")
class InMemoryDatabase implements Database {
    ArrayList<Product> productDatabase = new ArrayList<>();

    @Override
    public void save(Product product) {
        productDatabase.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : productDatabase) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
