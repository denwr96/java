package main.java.javaguru.sunday.student_sergej_savkin.lesson_2.level_3_junior.task_9;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int a = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(a + " x "+ i + " = " + (a * i));
        }
    }
}
