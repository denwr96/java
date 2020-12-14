package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_3;

//Task_7

interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
//этот интерфейс не функциональный, так как в нём целых 2 абстрактных метода