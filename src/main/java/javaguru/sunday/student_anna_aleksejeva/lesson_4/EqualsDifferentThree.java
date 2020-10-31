package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_4;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Очень важно соблюдать скобки при написании конструкций типа if else!")
public class EqualsDifferentThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter three numbers ");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int numberThree = sc.nextInt();
        if (numberOne == numberTwo && numberOne == numberThree) {
            System.out.println(" All numbers are equal ");
        } else if
        (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree){
            System.out.println(" All numbers are different ");
        } else{
            System.out.println(" Neither all are equal or different ");
        }
    }
}
