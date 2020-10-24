package main.java.javaguru.sunday.student_violeta_klimova.lesson_4.level_2;

import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int max;
        System.out.println("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextInt();

        max = firstNumber;
        if (secondNumber > max) {
            max = secondNumber;
        }

        System.out.println("Max = " + max);
    }
}