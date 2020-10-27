package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Please enter your first number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Please enter your second number");
        int number2 = scanner.nextInt();
        if (number1 < number2) {
            System.out.println("The smallest number is " + number1);
        } else {
            System.out.println("The smallest number is " + number2);
        }
    }
}
