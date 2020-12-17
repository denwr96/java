package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Optional;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Optional, должен быть параметризирован конкретным классом. Optional<Product>")
interface Database {

    void save(Product product);

    Optional findByTitle(String productTitle);

}
