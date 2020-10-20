package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson4.level3.task8;

import java.util.Scanner;

class ThreeEqualNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter your third number");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("All are neither equal nor different");
        }

    }

}
