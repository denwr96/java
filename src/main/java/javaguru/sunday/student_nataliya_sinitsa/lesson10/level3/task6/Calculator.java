package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task6;

@FunctionalInterface
interface Calculator {

    void calculate();

}

/*Функциональный интерфейс в Java – это интерфейс, который содержит только 1 абстрактный метод.
Основное назначение – использование в лямбда выражениях и method reference.
Наличие 1 абстрактного метода - это единственное условие,
таким образом функциональный интерфейс может содержать
так же default и static методы.*/