package main.java.javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_2_intern.task_9;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
