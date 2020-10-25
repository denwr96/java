package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_9;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class HelloUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);

    }
}
