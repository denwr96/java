package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3.task_10;

import java.util.Optional;

interface Database {

    void save(Product product);

    Optional findByTitle(String productTitle);

}
