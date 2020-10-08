package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_2.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("First number is" + firstNumber);

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Second number is" + secondNumber);

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);

    }
}
