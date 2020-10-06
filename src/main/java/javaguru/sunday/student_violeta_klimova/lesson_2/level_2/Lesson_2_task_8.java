package main.java.javaguru.sunday.student_violeta_klimova.lesson_2.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Lesson_2_task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String userName = scanner.next();

        System.out.println("Hello " + userName + "!");
    }
}