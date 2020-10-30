package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_4.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_2 {

    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number == 0) {
            System.out.println("Equals 0");
        } else {
            System.out.println("Negative");
        }
    }
}
