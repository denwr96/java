package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}