package javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task7;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task 7 -> Task 8
// данный интерфейс не является функциональным
// Multiple non-overriding abstract methods found in interface
// javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task7.Database
@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
