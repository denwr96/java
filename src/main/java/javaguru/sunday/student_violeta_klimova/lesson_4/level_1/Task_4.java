package main.java.javaguru.sunday.student_violeta_klimova.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}