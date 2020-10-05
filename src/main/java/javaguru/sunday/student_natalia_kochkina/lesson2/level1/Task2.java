package main.java.javaguru.sunday.student_natalia_kochkina.lesson2.level1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double secondDoubleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber + secondDoubleNumber;
        double subtaction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println(sum + "; " + subtaction + "; " + multiplication + "; " + division);
    }
}
