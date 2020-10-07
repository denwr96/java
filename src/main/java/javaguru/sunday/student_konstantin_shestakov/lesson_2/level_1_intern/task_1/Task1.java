package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_2.level_1_intern.task_1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int secondNumber = scanner.nextInt();

        System.out.print("'+' of your integers: ");
        System.out.println(firstNumber + secondNumber);

        System.out.print("'-' of your integers: ");
        System.out.println(firstNumber - secondNumber);

        System.out.print("'*' of your integers: ");
        System.out.println(firstNumber * secondNumber);

        System.out.print("'/' of your integers: ");
        System.out.println(firstNumber / secondNumber);

    }

}
