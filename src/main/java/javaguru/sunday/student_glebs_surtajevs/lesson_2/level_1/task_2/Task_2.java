package javaguru.sunday.student_glebs_surtajevs.lesson_2.level_1.task_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Please enter first number");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        double secondNumber = scanner.nextInt();
        double addition = firstNumber + secondNumber;
        System.out.println("Sum of two numbers =" + addition);
        double subtraction = firstNumber - secondNumber;
        System.out.println("Subtraction of two numbers =" + subtraction);
        double multiplication = firstNumber * secondNumber;
        System.out.println("Multiplication of two numbers =" + multiplication);
        double division = firstNumber / secondNumber;
        System.out.println("Division of two numbers =" + division);
    }
}