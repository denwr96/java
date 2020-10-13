package main.java.javaguru.sunday.student_natalia_kochkina.lesson_3.level_2;

//Task_9

import java.util.Scanner;

public class HelloUserName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);



    }
}

