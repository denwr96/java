package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_4_to_do;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input < 0) {
            System.out.println("Negative number!");
        } else if (input > 0) {
            System.out.println("Positive number!");
        }
    }
}


