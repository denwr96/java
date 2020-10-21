package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson4.level1.task2;

import java.util.Scanner;

class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int userNumber = scanner.nextInt();

        if (userNumber < 0) {
            System.out.println(userNumber + " is negative");
        } else if (userNumber > 0) {
            System.out.println(userNumber + " is positive");
        } else {
            System.out.println(userNumber + " is zero");
        }

    }

}
