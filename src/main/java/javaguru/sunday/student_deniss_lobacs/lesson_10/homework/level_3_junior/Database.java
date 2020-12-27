package main.java.javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_3_junior;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);
}
