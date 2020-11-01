package main.java.javaguru.sunday.teacher.lesson_6.lessoncode;

import java.util.Scanner;

public class ContinueExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number");
        int userInput = scanner.nextInt();

        int i = 0;
        int temp = 0;
        while (i < userInput) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println("Iteration: " + i + " Result: " + temp + " Operation: " + temp + " + " + i);
            temp = temp + i;
            i++;
        }
        System.out.println("Result: " + temp);
    }
}
