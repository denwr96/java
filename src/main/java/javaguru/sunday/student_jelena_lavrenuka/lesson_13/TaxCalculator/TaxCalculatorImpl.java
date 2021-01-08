package javaguru.sunday.student_jelena_lavrenuka.lesson_13.TaxCalculator;

// lesson_13 task_1
// lesson_13 task_2
// lesson_13 task_3
// lesson_13 task_4
// lesson_13 task_5
// lesson_13 task_6
// lesson_13 task_7
// lesson_13 task_8

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            var incomeBiggerThen20000 = income.subtract(new BigDecimal("20000"));
            var taxAfter20000 = incomeBiggerThen20000.multiply(new BigDecimal("0.40"));
            var taxBefore20000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            return taxBefore20000.add(taxAfter20000);
        }
    }
}
