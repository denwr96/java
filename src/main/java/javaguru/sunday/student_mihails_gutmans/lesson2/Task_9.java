package main.java.javaguru.sunday.student_mihails_gutmans.lesson2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Если хотите использовать циклы, то соблюдайте формат.")
public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner theNumber = new Scanner (System.in);
        int myNumber = theNumber.nextInt();
        int x = 1;

        while (x < 11) {
            System.out.println( + myNumber + " * " + x + " = " + (myNumber*x) );
            x = x+1;
        }
    }
}

