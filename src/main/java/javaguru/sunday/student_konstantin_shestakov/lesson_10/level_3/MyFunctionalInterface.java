package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3;

// Task 6
// Функциональный интерфейс в Java – это интерфейс, который содержит только 1 абстрактный метод.
// Так же может содержать default и static методы.

@FunctionalInterface
interface MyFunctionalInterface {

    void printInfo();

    default void printInfo2() {
        System.out.println("Print Info 2");
    }

    static void printInfo3() {
        System.out.println("Print Info 3");
    }
}