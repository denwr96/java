package main.java.javaguru.sunday.student_liana_shirmane.lesson_4.level_1;
//task4

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Please, enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

