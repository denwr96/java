package main.java.javaguru.sunday.student_liana_shirmane.lesson_2.level_1.task_1;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        System.out.println("Please, enter first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Please, enter second number:");
        int secondNumber = scanner.nextInt();
        int sumAmount = firstNumber + secondNumber;
        int minusAmount = firstNumber - secondNumber;
        int multiplicationAmount = firstNumber * secondNumber;
        double devisionAmount = (double) firstNumber / secondNumber;
        System.out.println("Sum of first and second numbers is equal to: " + sumAmount);
        System.out.println("Substraction of first and second numbers is equal to: " + minusAmount);
        System.out.println("Multiplication of first and second numbers is equal to: " + multiplicationAmount);
        System.out.println("Devision of first and second numbers is equal to: " + devisionAmount);

    }
}
