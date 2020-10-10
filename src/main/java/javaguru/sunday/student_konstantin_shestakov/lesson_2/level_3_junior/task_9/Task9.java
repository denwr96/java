package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_2.level_3_junior.task_9;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task9 {

    public static void main(String[] args) {

        System.out.print("Enter integer: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Multiplication table for chosen integer: ");
        System.out.println(number + " x 1 = " + number);
        System.out.println(number + " x 2 = " + number * 2);
        System.out.println(number + " x 3 = " + number * 3);
        System.out.println(number + " x 4 = " + number * 4);
        System.out.println(number + " x 5 = " + number * 5);
        System.out.println(number + " x 6 = " + number * 6);
        System.out.println(number + " x 7 = " + number * 7);
        System.out.println(number + " x 8 = " + number * 8);
        System.out.println(number + " x 9 = " + number * 9);
        System.out.println(number + " x 10 = " + number * 10);
    }
}
