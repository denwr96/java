package javaguru.sunday.student_anna_aleksejeva.lesson_10.task_7_8;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);
}
