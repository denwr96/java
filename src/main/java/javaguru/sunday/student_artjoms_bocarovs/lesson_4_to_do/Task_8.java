package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_4_to_do;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        System.out.println("Your first number: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        System.out.println("Your second number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Your third number:");
        int numberThree = scanner.nextInt();

        if (numberOne == numberTwo & numberThree == numberOne) {
            System.out.println("All numbers are equal");
        } else if (numberOne != numberTwo && numberTwo != numberThree && numberThree != numberOne) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }


    }
}
