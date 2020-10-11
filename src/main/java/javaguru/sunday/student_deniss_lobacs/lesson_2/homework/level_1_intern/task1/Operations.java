package main.java.javaguru.sunday.student_deniss_lobacs.lesson_2.homework.level_1_intern.task1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Хорошо, но я бы старался избегать использования статики. Позже, я расскажу почему")
public class Operations {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Enter first number: ");
        int numberOne = scn.nextInt();

        System.out.print("Enter first number: ");
        int numberTwo = scn.nextInt();


        System.out.println("Result1: " + (numberOne + numberTwo));
        System.out.println("Result2: " + (numberOne - numberTwo));
        System.out.println("Result3: " + (numberOne * numberTwo));
        System.out.println("Result4: " + (numberOne / numberTwo));

    }
}
