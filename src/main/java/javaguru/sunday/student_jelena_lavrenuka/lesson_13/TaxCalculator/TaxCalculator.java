package javaguru.sunday.student_jelena_lavrenuka.lesson_13.TaxCalculator;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.math.BigDecimal;

@CodeReview(approved = true)
interface TaxCalculator {

    BigDecimal calculateTax(BigDecimal income);
}
