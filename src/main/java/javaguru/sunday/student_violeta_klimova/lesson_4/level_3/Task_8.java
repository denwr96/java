package main.java.javaguru.sunday.student_violeta_klimova.lesson_4.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;

        System.out.println("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        thirdNumber = scanner.nextInt();

        if (secondNumber == firstNumber && secondNumber == thirdNumber) {
            System.out.println("Numbers are equals");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}