package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.Optional;
@CodeReview(approved = true)
@CodeReviewComment(comment = "Optional, должен быть параметризирован каким-то типом. К примеру, Optional<Product> или Optional<String>")
class DatabaseImpl implements Database {

    ArrayList<Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Optional findByTitle(String productTitle) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getTitle().equals(productTitle)) {
                System.out.println("Found: " + productList.get(i).getTitle() + ", element = " + (i + 1));
                return Optional.of(productList.get(i));
            }
        }
        return Optional.empty();
    }
}
