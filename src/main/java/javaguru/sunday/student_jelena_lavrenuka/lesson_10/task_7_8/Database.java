package javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_7_8;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
