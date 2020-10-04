package main.java.javaguru.sunday.student_sergej_savkin.lesson_2.level_3_junior.task_11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int first = scanner.nextInt();

        System.out.println("Please enter second number:");
        int second = scanner.nextInt();

        System.out.println("Please enter third number:");
        int third = scanner.nextInt();

        double average = ((double) first + (double) second + (double) third) / 3;

        System.out.println("The average of entered numbers is: " + average);
    }
}
