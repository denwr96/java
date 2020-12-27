package javaguru.sunday.student_deniss_lobacs.lesson_4.level_3_junior.task10;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Весь QuickMath нужно было уместить в одном классе")
public class QuickMath {

    public int Max(int numberOne , int numberTwo , int numberThree ) {

        if (numberOne > numberTwo && numberOne > numberThree) {

        }
            if (numberOne > numberTwo) {
                if (numberOne > numberThree) {
                    return numberOne;
                }
                else {
                    return numberThree;
                }
            }
            else if (numberTwo > numberThree) {
                return numberTwo;
            }
            else {
                return numberThree;
            }

    }
}
