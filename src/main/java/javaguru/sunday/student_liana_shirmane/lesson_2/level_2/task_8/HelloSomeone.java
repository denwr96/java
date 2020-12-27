package javaguru.sunday.student_liana_shirmane.lesson_2.level_2.task_8;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class HelloSomeone {
    public static void main(String[] args) {
        System.out.println("Please, enter your name:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName);
    }
}
