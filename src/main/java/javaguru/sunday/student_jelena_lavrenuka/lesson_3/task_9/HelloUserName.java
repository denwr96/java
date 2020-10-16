package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_9;

import java.util.Scanner;

class HelloUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);

    }
}
