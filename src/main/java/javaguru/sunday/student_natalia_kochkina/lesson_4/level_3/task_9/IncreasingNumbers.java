package main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_3.task_9;

//Task_9

import java.util.Scanner;

public class IncreasingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("The second number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("The third number: ");
        int numberThree = scanner.nextInt();

        if ((numberTwo == (numberOne + 1)) && (numberThree == (numberTwo + 1))) {
            System.out.println("increasing");
        } else if ((numberOne ==(numberTwo + 1)) && (numberTwo == (numberThree + 1))) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
