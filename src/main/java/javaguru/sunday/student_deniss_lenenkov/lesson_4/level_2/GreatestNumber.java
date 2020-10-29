package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_4.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Последний else if лишний. Его можно было бы убрать и программа бы никак от этого не поменялась бы.")
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:  ");
        int numberOne = scanner.nextInt();

        System.out.println("Enter second number:  ");
        int numberTwo = scanner.nextInt();

        if (numberOne >= numberTwo){
            System.out.println(numberOne);
        }else if (numberOne <= numberTwo){
            System.out.println(numberTwo);
        }

    }
}
