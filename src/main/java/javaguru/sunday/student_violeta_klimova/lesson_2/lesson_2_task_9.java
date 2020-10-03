package main.java.javaguru.sunday.student_violeta_klimova.lesson_2;

import java.util.Scanner;

public class lesson_2_task_9 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int yourNumber = scanner.nextInt();
        System.out.println("Your number is " + yourNumber);

        for (int multiplier = 1; multiplier <= 10 ; multiplier++) {
            int result = yourNumber * multiplier;
            System.out.println(yourNumber + " x " + multiplier + " = " + result);
        }
    }

}
