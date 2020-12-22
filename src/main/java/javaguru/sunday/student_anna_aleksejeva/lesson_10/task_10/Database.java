package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Optional;

@CodeReview(approved = true)
public interface Database {

    void save(Product product);

    Optional <Product> findByTitle(String productTitle);
}
