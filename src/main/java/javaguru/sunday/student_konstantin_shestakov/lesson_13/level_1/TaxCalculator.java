package javaguru.sunday.student_konstantin_shestakov.lesson_13.level_1;

// Task 1

import javaguru.sunday.teacher.annotations.CodeReview;

import java.math.BigDecimal;
@CodeReview(approved = true)
interface TaxCalculator {

    BigDecimal calculateTax(BigDecimal income);

}
