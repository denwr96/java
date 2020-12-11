package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_7_8;

// lesson_10 task_7
// lesson_10 task_8
// lesson_10 task_10

import java.util.ArrayList;

class InMemoryDatabase implements Database {
    ArrayList<Product> productDatabase = new ArrayList<>();

    @Override
    public void save(Product product) {
        productDatabase.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : productDatabase) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
