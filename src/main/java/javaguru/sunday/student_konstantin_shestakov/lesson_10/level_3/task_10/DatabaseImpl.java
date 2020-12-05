package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3.task_10;

import java.util.ArrayList;
import java.util.Optional;

class DatabaseImpl implements Database {

    ArrayList<Product> productList = new ArrayList<Product>();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Optional findByTitle(String productTitle) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getTitle() == productTitle) {
                System.out.println("Found: " + productList.get(i).getTitle() + ", element = " + (i + 1));
                return Optional.of(productList.get(i));
            }
        }
        return Optional.empty();
    }
}
