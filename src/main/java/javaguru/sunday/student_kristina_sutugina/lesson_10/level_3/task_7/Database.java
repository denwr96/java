package javaguru.sunday.student_kristina_sutugina.lesson_10.level_3.task_7;
//Это не функциональный интерфейс, так как Функциональный интерфейс в Java – это интерфейс, который содержит 1 абстрактный метод.


interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}