package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3.task_8;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product) ;

    Product findByTitle(String productTitle);

}
