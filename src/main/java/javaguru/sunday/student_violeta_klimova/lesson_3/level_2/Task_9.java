package main.java.javaguru.sunday.student_violeta_klimova.lesson_3.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your user name?");
        String userName = scanner.next();
        String greeting = "Hello " + userName + "!";
        System.out.println(greeting);
}
}
