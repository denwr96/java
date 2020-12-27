package javaguru.sunday.student_natashakucerenko.lesson1;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Плохое название переменных")
public class TwoNumbers {
    public static void main(String[] args) {
        int a = 74;
        int b = 36;
        System.out.println("a + b = " + (a + b));
        int c = 50;
        int d = 3;
        System.out.println("b / a = " + (c / d));
    }
}
