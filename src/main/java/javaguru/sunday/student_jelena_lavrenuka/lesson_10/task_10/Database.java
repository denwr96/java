package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_10;

import java.util.Optional;

interface Database {

    void save(Product product);

    Optional findByTitle(String productTitle);

}
