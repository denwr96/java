package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Please enter your first number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Please enter your second number");
        int number2 = scanner.nextInt();
        System.out.println("Please enter your third number");
        int number3 = scanner.nextInt();
        if (number3 > number2 && number3 > number1) {
            System.out.println("The biggest number is " + number3);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The biggest number is " + number2);
        } else {
            System.out.println("The biggest number is " + number1);
        }
    }
}
