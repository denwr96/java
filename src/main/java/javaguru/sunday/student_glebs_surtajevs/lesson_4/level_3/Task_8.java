package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Please enter your first number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Please enter your second number");
        int number2 = scanner.nextInt();
        System.out.println("Please enter your third number");
        int number3 = scanner.nextInt();
        if (number1 == number2 && number3 == number1) {
            System.out.println("All numbers are equal");
        } else if (number1 != number2 && number2 != number3 && number3 != number1) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
