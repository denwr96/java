package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task10;

//Task 7 -> Task 8
// данный интерфейс не является функциональным
// Multiple non-overriding abstract methods found in interface
// main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task7.Database

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Optional;
@CodeReview(approved = true)
@CodeReviewComment(comment = "Optional должен быть параметризирован. Какой именно тип вы хотите обернуть в Optional? Optional<Product>?")
interface Database {

    void save(Product product);

    Optional findByTitle(String productTitle);

}
