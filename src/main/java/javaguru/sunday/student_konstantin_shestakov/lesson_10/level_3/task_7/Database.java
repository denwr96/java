package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3.task_7;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 7 - данный интерфейс не является функциональным (более одного абстрактного метода, если добавить аннтоацию скомпилировать код будет невозможно).
@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
