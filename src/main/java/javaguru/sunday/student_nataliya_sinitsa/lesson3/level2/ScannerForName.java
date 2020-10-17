package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level2;

import java.util.Scanner;

public class ScannerForName {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hi " + userName + "!");
    }
}
