package main.java.javaguru.sunday.student_artjom_proshkin.lesson_10.level_3_junior.task_10;

import java.util.Optional;

interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
