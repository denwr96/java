package javaguru.sunday.student_liana_shirmane.lesson_10.level_3;
//task7
//нет, тут больше одного абстрактного метода

import javaguru.sunday.teacher.annotations.CodeReview;

//task8
@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}



