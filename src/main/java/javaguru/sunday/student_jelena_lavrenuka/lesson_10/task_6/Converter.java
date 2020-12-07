package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_6;

// Функциональный интерфейс (functional interface) – это интерфейс у которого только один абстрактный метод.
// Функциональный интерфейс может содержать любое количество методов по умолчанию (default) или статических методов.

@FunctionalInterface
interface Converter {
    void currencyConverter(double number);

    default double depositMoney(double number){
        return 0;
    }
}
