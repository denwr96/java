package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_4_to_do;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        System.out.println("Your first number: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        System.out.println("Your second number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Your third number:");
        int numberThree = scanner.nextInt();

        if (numberOne < numberThree && numberTwo < numberThree) {
            System.out.println("The biggest number is: " + numberOne);
        } else if (numberOne < numberTwo && numberThree < numberTwo) {
            System.out.println("The biggest number is: " + numberTwo);
        } else {
            System.out.println("The biggest number is: " + numberThree);
        }
    }
}
