package main.java.javaguru.sunday.student_liana_shirmane.lesson_2.level_1.task_2;

import java.util.Scanner;

public class MathDouble {
    public static void main(String[] args) {
        System.out.println("Please, enter first number:");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        System.out.println("Please, enter second number:");
        double secondNumber = scanner.nextDouble();
        double sumAmount = firstNumber + secondNumber;
        double minusAmount = firstNumber - secondNumber;
        double multiplicationAmount = firstNumber * secondNumber;
        double devisionAmount = firstNumber / secondNumber;
        System.out.println("Sum of first and second numbers is equal to: " + sumAmount);
        System.out.println("Substraction of first and second numbers is equal to: " + minusAmount);
        System.out.println("Multiplication of first and second numbers is equal to: " + multiplicationAmount);
        System.out.println("Devision of first and second numbers is equal to: " + devisionAmount);

    }
}
