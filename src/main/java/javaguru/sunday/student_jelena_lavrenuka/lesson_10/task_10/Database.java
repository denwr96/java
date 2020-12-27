package javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Optional;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Optional, должен быть параметризирован конкретным классом. Optional<Product>")
interface Database {

    void save(Product product);

    Optional <Product> findByTitle(String productTitle);

}
