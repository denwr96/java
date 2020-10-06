package main.java.javaguru.sunday.student_violeta_klimova.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("First number is: " + firstNumber);

        System.out.println("Enter your second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Second number is: " + secondNumber);

        System.out.println("Enter your third number:");
        double thirdNumber = scanner.nextDouble();
        System.out.println("Third number is: " + thirdNumber);

        System.out.println("Average of them: " + (firstNumber + secondNumber + thirdNumber) / 3);

    }
}