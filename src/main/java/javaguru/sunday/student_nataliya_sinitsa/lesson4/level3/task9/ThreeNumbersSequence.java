package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson4.level3.task9;

import java.util.Scanner;

class ThreeNumbersSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter your third number");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("decreasing");
        } else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("increasing");
        } else {
            System.out.println("neither increasing nor decreasing order");
        }

    }

}
