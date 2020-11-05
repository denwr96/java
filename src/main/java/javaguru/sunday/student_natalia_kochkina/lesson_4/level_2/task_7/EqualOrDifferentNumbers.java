package main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_2.task_7;

//Task_7

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class EqualOrDifferentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("The second number: ");
        int numberTwo = scanner.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
