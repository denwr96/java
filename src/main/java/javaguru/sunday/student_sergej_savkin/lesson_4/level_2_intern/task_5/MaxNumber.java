package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_2_intern.task_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class MaxNumber {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number");
        firstNumber = scanner.nextInt();
        System.out.println("PLease enter second number");
        secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("Maximum number is: " + firstNumber);
        } else if (firstNumber < secondNumber){
            System.out.println("Maximum number is: " + secondNumber);
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
