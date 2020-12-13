package main.java.javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_3_junior;

public interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);
}
