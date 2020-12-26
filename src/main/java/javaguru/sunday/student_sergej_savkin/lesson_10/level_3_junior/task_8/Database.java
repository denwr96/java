package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_3_junior.task_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
