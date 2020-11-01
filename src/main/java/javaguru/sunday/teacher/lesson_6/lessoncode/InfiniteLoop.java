package main.java.javaguru.sunday.teacher.lesson_6.lessoncode;

import main.java.javaguru.sunday.teacher.lesson_3.lessoncode.Car;

import java.util.Scanner;

public class InfiniteLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type your number");
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
        }
    }
}
