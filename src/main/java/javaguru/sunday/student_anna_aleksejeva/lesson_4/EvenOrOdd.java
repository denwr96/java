package javaguru.sunday.student_anna_aleksejeva.lesson_4;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
public class EvenOrOdd {
    public static void main(String[]args){
        System.out.println(" Enter number ");
        Scanner sc = new Scanner(System.in);
        int number =  sc.nextInt();
        if (number % 2 == 0 ) {
            System.out.println(" Even ");
        } else {
            System.out.println(" Odd ");
        }
    }
}
