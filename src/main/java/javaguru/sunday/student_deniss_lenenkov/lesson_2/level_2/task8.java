package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_2.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String yourName = scanner.nextLine();

        System.out.println("Hello" + yourName);

    }
}
