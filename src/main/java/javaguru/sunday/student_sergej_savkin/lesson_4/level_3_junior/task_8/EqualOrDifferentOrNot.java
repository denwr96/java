package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_3_junior.task_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class EqualOrDifferentOrNot {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number");
        firstNumber = scanner.nextInt();
        System.out.println("PLease enter second number");
        secondNumber = scanner.nextInt();
        System.out.println("PLease enter third number");
        thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && (secondNumber == thirdNumber)) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && (secondNumber != thirdNumber)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Some numbers are equal");
        }
    }
}
