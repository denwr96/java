package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3.task_8;

import java.util.ArrayList;

class InMemoryDatabase implements Database {

    ArrayList<Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getTitle() == productTitle) {
                System.out.println("Found: " + productList.get(i).getTitle() + ", element = " + (i + 1));
                return productList.get(i);
            }
        }
        return null;
    }
}
