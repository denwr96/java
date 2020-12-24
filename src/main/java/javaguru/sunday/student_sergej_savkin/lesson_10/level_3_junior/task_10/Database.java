package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_3_junior.task_10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Optional;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
