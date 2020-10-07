package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_2.level_1_intern.task_2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("'+' of your numbers: ");
        System.out.println(firstNumber + secondNumber);

        System.out.print("'-' of your numbers: ");
        System.out.println(firstNumber - secondNumber);

        System.out.print("'*' of your numbers: ");
        System.out.println(firstNumber * secondNumber);

        System.out.print("'/' of your numbers: ");
        System.out.println(firstNumber / secondNumber);

    }

}
