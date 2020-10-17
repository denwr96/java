package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User name: ");


        String userName = scanner.next();
        System.out.println("Hello " + userName);

        //Task_9
    }
}
