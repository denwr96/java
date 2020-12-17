package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_3.Task_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_8
@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}