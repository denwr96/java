package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_4_to_do;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_6 {

    public static void main(String[] args) {

        System.out.println("Your first number: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        System.out.println("Your second number: ");
        int numberTwo = scanner.nextInt();

        if (numberOne < numberTwo) {
            System.out.println("Smallest number is:" + numberOne);
        } else {
            System.out.println("Smallest number is:" + numberTwo);
        }
    }
}
