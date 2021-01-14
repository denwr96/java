package javaguru.sunday.student_liana_shirmane.lesson_13.level_1;
//task1

import javaguru.sunday.teacher.annotations.CodeReview;

import java.math.BigDecimal;
@CodeReview(approved = true)
interface TaxCalculator {

    BigDecimal calculateTax(BigDecimal income);
}
