package javaguru.sunday.student_anna_aleksejeva.lesson_4;
import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
public class EqualsDifferentTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter two numbers ");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        if (numberOne == numberTwo) {
            System.out.println(" Numbers are equals ");
        } else
            System.out.println(" Numbers are different ");
        }
    }

