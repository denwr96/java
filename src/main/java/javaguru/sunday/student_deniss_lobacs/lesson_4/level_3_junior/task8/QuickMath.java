package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_3_junior.task8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Весь QuickMath нужно было уместить в одном классе")
public class QuickMath {

    public String Compare(int numberOne , int numberTwo , int numberThree ) {

        if (numberOne == numberTwo && numberOne == numberThree) {

            return "All numbers are equal";

        } else if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree) {

            return "All numbers are different";

        } else {

            return "Neither all are equal or different";

        }

    }
}
