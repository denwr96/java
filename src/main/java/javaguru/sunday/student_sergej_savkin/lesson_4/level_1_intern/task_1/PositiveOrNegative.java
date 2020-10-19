package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_1_intern.task_1;

import java.util.Scanner;

class PositiveOrNegative {
    public static void main(String[] args) {
        int number;

        System.out.println("Please enter your number: ");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number > 0){
            System.out.println("Your number is positive");
        } else if (number < 0){
            System.out.println("Your number is negative");
        } else {
            System.out.println("Wrong number!");
        }

    }
}
