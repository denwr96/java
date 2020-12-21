package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
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


