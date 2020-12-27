package javaguru.sunday.student_artjom_proshkin.lesson_10.level_3_junior.task_6;

//Task_6
/* Функциональный интерфейс (functional interface) – это интерфейс у которого только один абстрактный метод.
Функциональный интерфейс может содержать любое количество методов по умолчанию (default) или статических методов.*/

@java.lang.FunctionalInterface
interface FunctionalInterface {

    default String sayHello (){
        return "Hello";
    }

    void work();
}
