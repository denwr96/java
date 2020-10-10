package main.java.javaguru.sunday.student_artjom_proshkin.lesson_2.level_3_junior.task_11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class MiddleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number : ");
        int secondNumber = scanner.nextInt();

        System.out.println("Please enter third number : ");
        int thirdNumber = scanner.nextInt();

        double middleNumber = ((double)firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Middle number is : " + middleNumber);
    }
}
