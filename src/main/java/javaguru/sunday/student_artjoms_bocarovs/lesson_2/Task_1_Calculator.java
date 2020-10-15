package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_2;

import java.util.Scanner;

// I tried to make calculator which accepts only numbers and if you enter letters or symbols it will show notification that it is possible to enter only numbers.

public class Task_1_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String firstNumber = scanner.next();
        while (!isNumbers(firstNumber)) {
            System.out.print("Pleas enter only numbers: ");
            firstNumber = scanner.next();
        }

        System.out.print("Enter second number: ");
        String secondNumber = scanner.next();
        while (!isNumbers(secondNumber)) {
            System.out.print("Pleas enter only numbers: ");
            secondNumber = scanner.next();
        }

        System.out.println(" ");
        System.out.println("Addition: " + (Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber)));
        System.out.println("Subtraction: " + (Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber)));
        System.out.println("Multiplication: " + (Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber)));
        System.out.println("Division: " + (Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber)));
    }

    private static boolean isNumbers(String text) {
        return ((text.matches("[0-9]+")));
    }

}
