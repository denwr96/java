package main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_1.task_4;

//Task_4

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int remainder = number % 2;

        if (remainder == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}
