package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_2_intern.task5;


import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Весь QuickMath нужно было уместить в одном классе")
public class QuickMath {

    public int Max(int numberOne , int numberTwo) {

        if (numberOne >= numberTwo) {
            return numberOne;
        }  else {
            return numberTwo;
        }
    }
}
