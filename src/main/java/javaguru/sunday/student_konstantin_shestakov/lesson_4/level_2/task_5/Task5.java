package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_2.task_5;

import java.util.Scanner;

class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second integer: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("First integer is greater: " + firstNumber + " > " + secondNumber);
        }
        else if (firstNumber < secondNumber) {
            System.out.println("Second integer is greater: " + secondNumber + " > " + firstNumber);
        }
        else {
            System.out.println("Integers are even: " + firstNumber + " = " + secondNumber);
        }

    }
}
