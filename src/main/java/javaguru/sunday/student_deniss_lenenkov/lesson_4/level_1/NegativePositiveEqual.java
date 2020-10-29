package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_4.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Последний else if лишний. Его можно было бы убрать и программа бы никак от этого не поменялась бы.")
public class NegativePositiveEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if ( number > 0){
            System.out.println("Positive");
        }else if ( number < 0){
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("Equal");
        }
    }
}
