package javaguru.sunday.student_natalia_kochkina.lesson_10.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_7
@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
//этот интерфейс не функциональный, так как в нём целых 2 абстрактных метода