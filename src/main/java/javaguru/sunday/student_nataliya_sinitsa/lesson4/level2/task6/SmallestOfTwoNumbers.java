package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson4.level2.task6;

import java.util.Scanner;

class SmallestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber <= secondNumber) {
            System.out.println("The smallest number is " + firstNumber);
        } else {
            System.out.println("The smallest number is " + secondNumber);
        }

    }

}
