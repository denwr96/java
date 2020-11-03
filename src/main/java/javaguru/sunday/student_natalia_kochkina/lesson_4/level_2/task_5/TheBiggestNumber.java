package main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_2.task_5;

//Task_5

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class TheBiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("The second number: ");
        int numberTwo = scanner.nextInt();

        if (numberOne > numberTwo) {
            System.out.println(numberOne);
        } else {
            System.out.println(numberTwo);
        }
    }
}
