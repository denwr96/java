package javaguru.sunday.student_liana_shirmane.lesson_13.level_1;
//task2
//task5
//task8

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        BigDecimal limitValue = new BigDecimal("20000");
        if (income.compareTo(limitValue) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            BigDecimal toPay40 = income.subtract(new BigDecimal("20000"));
            BigDecimal moreThan20000 = toPay40.multiply(new BigDecimal("0.40"));
            BigDecimal lessThan20000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            return lessThan20000.add(moreThan20000);

        }
    }
}
