package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson2.level2.task8;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, please");
        String userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
    }
}
