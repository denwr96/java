package main.java.javaguru.sunday.student_sergej_savkin.lesson_2.level_2_intern.task_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is you name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");
    }
}
