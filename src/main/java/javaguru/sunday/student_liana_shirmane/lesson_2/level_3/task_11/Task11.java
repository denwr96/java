package main.java.javaguru.sunday.student_liana_shirmane.lesson_2.level_3.task_11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Please, enter first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Please, enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Please, enter third number:");
        int thirdNumber = scanner.nextInt();
        double average = (double)(firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Average of three numbers is: " + average);
    }
}
