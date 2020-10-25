package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson4.level1.task4;

import java.util.Scanner;

class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int userNumber = scanner.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println(userNumber + " is even");
        } else {
            System.out.println(userNumber + " is odd");
        }

    }

}
