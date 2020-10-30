package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_2.task_7;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second integer: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Numbers are different");
        }

    }
}
