package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Функциональный интерфейс (functional interface) – это интерфейс у которого только один абстрактный метод.
// Функциональный интерфейс может содержать любое количество методов по умолчанию (default) или статических методов.
@CodeReview(approved = true)
@FunctionalInterface
interface Converter {
    void currencyConverter(double number);

    default double depositMoney(double number){
        return 0;
    }
}
