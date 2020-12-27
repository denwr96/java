package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 6
// Функциональный интерфейс в Java – это интерфейс, который содержит только 1 абстрактный метод.
// Так же может содержать default и static методы.
@CodeReview(approved = true)
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