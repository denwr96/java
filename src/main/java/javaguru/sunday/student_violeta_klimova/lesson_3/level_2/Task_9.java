package main.java.javaguru.sunday.student_violeta_klimova.lesson_3.level_2;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your user name?");
        String userName = scanner.next();
        String greeting = "Hello " + userName + "!";
        System.out.println(greeting);
}
}
