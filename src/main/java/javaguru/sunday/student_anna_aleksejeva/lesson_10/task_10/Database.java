package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_10;

import java.util.Optional;

public interface Database {

    void save(Product product);

    Optional <Product> findByTitle(String productTitle);
}
