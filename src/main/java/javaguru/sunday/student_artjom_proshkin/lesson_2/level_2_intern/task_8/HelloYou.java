package main.java.javaguru.sunday.student_artjom_proshkin.lesson_2.level_2_intern.task_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class HelloYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Hello! What's your name ?");
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + " !");

    }
}
