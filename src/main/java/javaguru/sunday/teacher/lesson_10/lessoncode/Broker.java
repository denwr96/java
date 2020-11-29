package main.java.javaguru.sunday.teacher.lesson_10.lessoncode;

import java.math.BigDecimal;

public class Broker {

    InsurancePremiumCalculator calculator;

    public Broker(InsurancePremiumCalculator calculator) {
        this.calculator = calculator;
    }

    public BigDecimal callToTheCustomerAndCalculatePremiumForHim() {
        Policy policy = new Policy(); // Web UI

        BigDecimal premium = calculator.calculate(policy);
        return premium;
    }

    public BigDecimal calculateWithValidation() {
        BigDecimal bigDecimal = calculator.calculateWithValidation(new Policy());
        return bigDecimal;
    }
}
