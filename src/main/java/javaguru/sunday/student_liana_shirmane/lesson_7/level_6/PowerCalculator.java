package javaguru.sunday.student_liana_shirmane.lesson_7.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

//task10
@CodeReview(approved = true)
@CodeReviewComment(comment = "Ох как сложно =) Хорошо, что есть тесты.")
public class PowerCalculator {
    public double power(int base, int exponent) {
        double result = 1.00;
        if (exponent > 0) {
            for (int i = 1; i <= exponent; i++) {
                result = result * base;

            }
        } else if (exponent < 0 && base!= 0) {
                for (int i = 1; i <= (exponent * (-1)); i++) {
                    double devider = 1.00;
                    devider = devider * base;
                    result = (result / devider);
                }
            } else if (exponent == 0) {
            return 1;
        } else    {
            System.out.println("Forbidden to divide by zero");
            return base;
        }
        return result;
    }
}
