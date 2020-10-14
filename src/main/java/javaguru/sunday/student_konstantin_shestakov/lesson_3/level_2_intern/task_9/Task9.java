package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_2_intern.task_9;

import java.util.Scanner;

class Task9 {

    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
