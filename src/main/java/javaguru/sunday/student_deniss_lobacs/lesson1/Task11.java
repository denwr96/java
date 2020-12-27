package javaguru.sunday.student_deniss_lobacs.lesson1;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
public class Task11 {

    public static void main(String[] args) {

        // First part

        int numberOne = 74, numberTwo = 36;
        int result = numberOne + numberTwo;

        System.out.println("Test Data: 74+36");
        System.out.print("Expected Output: ");
        System.out.println(result);

        System.out.println(); // разделение двух заданий

        // Second part

        numberOne = 50;
        numberTwo = 3;
        result = numberOne / numberTwo;

        System.out.println("Test Data: 50/3");
        System.out.print("Expected Output: ");
        System.out.print(result);

    }
}

