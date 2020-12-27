package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9 {

    public static void main(String[] args) {

        System.out.println("Your first number: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        System.out.println("Your second number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Your third number:");
        int numberThree = scanner.nextInt();

        if (numberOne > numberTwo && numberThree > numberOne) {
            System.out.println("Decreasing!");
        } else if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("Increasing!");
        } else {
            System.out.println("Neither increasing or decreasing order!");
        }
    }
}