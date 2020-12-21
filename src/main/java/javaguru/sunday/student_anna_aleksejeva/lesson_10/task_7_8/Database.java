package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_7_8;

public interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);
}
