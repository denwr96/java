package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_4.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
public class EqualDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int numberOne = scanner.nextInt();

        System.out.println("Enter second number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Enter third number: ");
        int numberThree = scanner.nextInt();

        if (numberOne == numberTwo && numberOne == numberThree && numberTwo == numberThree) {
            System.out.println("Equal");
        } else if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree) {
            System.out.println("Different");
        } else {
            System.out.println("Equal or Different");
        }
    }
}
