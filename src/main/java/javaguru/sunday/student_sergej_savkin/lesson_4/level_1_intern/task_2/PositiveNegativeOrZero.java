package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_1_intern.task_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class PositiveNegativeOrZero {
    public static void main(String[] args) {
        int number;

        System.out.println("Please enter your number: ");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number > 0){
            System.out.println("Your number is positive");
        } else if (number == 0){
            System.out.println("Your number is 0");
        } else {
            System.out.println("Your number is negative");
        }
    }
}
