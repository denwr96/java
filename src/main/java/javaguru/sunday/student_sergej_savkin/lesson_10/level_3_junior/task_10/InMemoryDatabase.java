package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_3_junior.task_10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@CodeReview(approved = false)
@CodeReviewComment(comment = "Используйте коллекцию ArrayList")
class InMemoryDatabase implements Database {

    List<Product> productList = new ArrayList();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        Product resultProduct = null;
        for (Product product : productList) {
            if (product.getTitle().equals(productTitle)) {
                resultProduct = product;
            }
        }
        return Optional.ofNullable(resultProduct);
    }

}
