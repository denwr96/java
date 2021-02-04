package javaguru.sunday.student_sergej_savkin.lesson_12.level_3_junior.task_19;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.InputMismatchException;
import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(comment = "Можно обойтись без finally в таком случае")
class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter whole number");
            try {
                int wholeNumber;
                wholeNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, try again");
            } finally {
                System.out.println("Please enter again");
            }
        }
    }
}


