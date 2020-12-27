package javaguru.sunday.student_violeta_klimova.lesson_2.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Lesson_2_task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("First number is "+ firstNumber);

        System.out.println("Enter your second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Second number is "+ secondNumber);

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }
}

