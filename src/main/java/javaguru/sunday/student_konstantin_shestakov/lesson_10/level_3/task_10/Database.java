package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Optional;
@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Optional findByTitle(String productTitle);

}
