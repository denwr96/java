package main.java.javaguru.sunday.teacher.lesson_10.lessoncode;

import java.math.BigDecimal;

public interface InsurancePremiumCalculator {

    default void doSameChecks() {
        System.out.println("Executing default logic");
    }

    default BigDecimal calculateWithValidation(Policy policy)
    {
        System.out.println("Executing default logic");
        return new BigDecimal("0");
    }

    BigDecimal calculate(Policy policy);

}
