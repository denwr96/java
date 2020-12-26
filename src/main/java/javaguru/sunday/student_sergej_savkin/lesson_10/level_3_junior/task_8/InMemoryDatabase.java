package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_3_junior.task_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
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
    public Product findByTitle(String productTitle) {
        for (int i = 0; i < productArray.length; i++) {
            if(productArray[i].getTitle().equals(productTitle)) {
                return productArray[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "InMemoryDatabase{" +
                "productArray=" + Arrays.toString(productArray) +
                '}';
    }

}
