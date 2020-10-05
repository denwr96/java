package main.java.javaguru.sunday.student_natalia_kochkina.lesson2.level2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Username:");

        String username = scanner.nextLine();

        System.out.println("Hello " + username + "!");
    }
}
