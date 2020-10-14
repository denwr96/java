package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_2.level_1.task_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Please enter first number");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scanner.nextInt();
        int addition = firstNumber + secondNumber;
        System.out.println("Sum of two numbers =" + addition);
        int subtraction = firstNumber - secondNumber;
        System.out.println("Subtraction of two numbers =" + subtraction);
        int multiplication = firstNumber * secondNumber;
        System.out.println("Multiplication of two numbers =" + multiplication);
        int division = firstNumber / secondNumber;
        System.out.println("Division of two numbers =" + division);


    }
}
